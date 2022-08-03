package edu.programmers.practice.all.level1.p12921;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int n = 10;
//        int n = 5;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {
    private static final List<Integer> answers = new LinkedList<>();
    private static int[] numbers;

    public int solution(int n) {
        setNumbers(n);

        IntStream.rangeClosed(2, n)
                 .forEach(number -> {
                     if (isChecked(number)) {
                         return;
                     }
                     if (isPrimeNumber(number)) {
                         eraseNumbers(number, n);
                         answers.add(number);
                     }
                 });

        return answers.size();
    }

    public static void setNumbers(int n) {
        numbers = IntStream.rangeClosed(0, n).toArray();
    }

    public static boolean isChecked(int number) {
        return numbers[number] == 0;
    }

    public static boolean isPrimeNumber(int number) {
        for (int n = 2; n <= Math.sqrt(number); n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void eraseNumbers(int number, int n) {
        for (int idx = 2; idx * number <= n; idx++) {
            numbers[idx * number] = 0;
        }
    }
}
