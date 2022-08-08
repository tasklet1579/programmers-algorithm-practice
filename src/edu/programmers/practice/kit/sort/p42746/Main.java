package edu.programmers.practice.kit.sort.p42746;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(new Solution().solution(numbers));
    }
}

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] str = new String[numbers.length];

        for (int idx = 0; idx < numbers.length; idx++) {
            str[idx] = String.valueOf(numbers[idx]);
        }

        Arrays.sort(str, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));

        for (String num : str) {
            answer.append(num);
        }

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
