package edu.programmers.practice.all.level1.p12928;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int n = 12;
//        int n = 9;
//        int n = 5;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {

    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        int answer = IntStream.rangeClosed(1, (int) sqrt)
                              .filter(num -> n % num == 0)
                              .map(num -> (num + n / num))
                              .sum();
        return answer - ((n % sqrt == 0) ? n / (int) sqrt : 0);
    }
}
