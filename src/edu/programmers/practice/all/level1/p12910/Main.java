package edu.programmers.practice.all.level1.p12910;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {5, 9, 7, 10};
//        int divisor = 5;
//        int[] arr = {2, 36, 1, 3};
//        int divisor = 1;
        int[] arr = {3, 2, 6};
        int divisor = 10;
        System.out.println(Arrays.toString(new Solution().solution(arr, divisor)));
    }
}

class Solution {

    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);

        List<Integer> numbers = new LinkedList<>();
        for (int number : arr) {
            if (number % divisor == 0) {
                numbers.add(number);
            }
        }

        int idx = 0;
        int[] answer = new int[numbers.size()];
        for (int number : numbers) {
            answer[idx++] = number;
        }

        return idx == 0 ? new int[]{-1} : answer;
    }
}
