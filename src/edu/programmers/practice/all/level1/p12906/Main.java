package edu.programmers.practice.all.level1.p12906;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(new Solution().solution(arr)));
    }
}

class Solution {

    public int[] solution(int []arr) {
        Deque<Integer> numbers = new LinkedList<>();
        for (int element : arr) {
            if (numbers.isEmpty()) {
                numbers.add(element);
                continue;
            }
            if (numbers.peekLast() == element) {
                continue;
            }
            numbers.add(element);
        }

        int idx = 0;
        int[] answer = new int[numbers.size()];
        while (!numbers.isEmpty()) {
            answer[idx++] = numbers.pollFirst();
        }
        return answer;
    }
}
