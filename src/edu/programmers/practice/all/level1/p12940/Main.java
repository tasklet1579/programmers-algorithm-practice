package edu.programmers.practice.all.level1.p12940;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(new Solution().solution(n, m)));
    }
}

class Solution {
    private static int gcd = 1;
    private static int lcm = 1;
    private static int divider;
    private static Map<Integer, Integer> number1;
    private static Map<Integer, Integer> number2;

    public int[] solution(int n, int m) {
        init();
        findGreatestCommonDivisor(n, m);
        init();
        findLowestCommonMultiple(n, m);

        return new int[]{gcd, lcm};
    }

    public void init() {
        divider = 2;
        number1 = new HashMap<>();
        number2 = new HashMap<>();
    }

    public void findGreatestCommonDivisor(int n, int m) {
        while (n != 1 && m != 1) {
            n = divideNumber(n, number1);
            m = divideNumber(m, number2);
            if (hasValue()) {
                gcd *= min(pow(number1), pow(number2));
            }
            divider++;
        }
    }

    public void findLowestCommonMultiple(int n, int m) {
        while (n != 1 || m != 1) {
            n = divideNumber(n, number1);
            m = divideNumber(m, number2);
            lcm *= max(pow(number1), pow(number2));
            divider++;
        }
    }

    public int divideNumber(int n, Map<Integer, Integer> hashMap) {
        while (n % divider == 0) {
            n /= divider;
            int count = hashMap.getOrDefault(divider, 0);
            hashMap.put(divider, count + 1);
        }

        return n;
    }

    public boolean hasValue() {
        return number1.getOrDefault(divider, 0) > 0
                && number2.getOrDefault(divider, 0) > 0;
    }

    public int min(int n, int m) {
        return Math.min(n, m);
    }

    public int max(int n, int m) {
        return Math.max(n, m);
    }

    public int pow(Map<Integer, Integer> hashMap) {
        return (int) Math.pow(divider, hashMap.getOrDefault(divider, 0));
    }
}
