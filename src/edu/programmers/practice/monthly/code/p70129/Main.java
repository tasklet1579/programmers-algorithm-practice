package edu.programmers.practice.monthly.code.p70129;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(new Solution().solution(s)));
    }
}

class Solution {

    public int[] solution(String s) {
        int repeat = 0;
        int remove = 0;

        while (!s.equals("1")) {
            int count = countZero(s);
            s = convertNotation(s.length() - count);

            repeat++;
            remove += count;
        }

        return new int[]{repeat, remove};
    }

    public int countZero(String s) {
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch - 48 == 0) {
                count++;
            }
        }

        return count;
    }

    public String convertNotation(int length) {
        List<Integer> numbers = new LinkedList<>();
        int divisor = 2;

        while (true) {
            if (length < divisor) {
                numbers.add(length);
                break;
            } else {
                numbers.add(length % divisor);
                length = length / divisor;
            }
        }

        Collections.reverse(numbers);

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number);
        }

        return sb.toString();
    }
}
