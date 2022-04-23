package edu.programmers.practice.kit.queue.p42586;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
	    System.out.println(Arrays.toString(new Solution().solution(progresses, speeds)));
    }
}

class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new LinkedList<>();
        int begin = 0, end = progresses.length, finish = 100, count = 0;

        while (begin < end) { // 모든 기능 개선 작업이 완료될 때까지
            boolean deploy = true;
            int days = (int) Math.ceil((finish - progresses[begin]) / (double) speeds[begin]); // 작업일수 계산

            for (int idx = begin; idx < end; idx++) {
                progresses[idx] += speeds[idx] * days; // 진도율 계산
                
                if (deploy && progresses[idx] >= finish) { // 진도율 100% 달성
                    begin++;
                    count++;
                    continue;
                }

                deploy = false;
            }

            answer.add(count);
            count = 0;
        }

        return answer.stream().mapToInt(idx -> idx).toArray();
    }
}
