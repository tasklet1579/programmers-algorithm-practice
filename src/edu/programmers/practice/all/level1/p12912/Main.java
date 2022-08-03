package edu.programmers.practice.all.level1.p12912;

import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(new Solution().solution(a, b));
    }
}

class Solution {

    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }

        int begin;
        int end;
        if (a < b) {
            begin = a;
            end = b;
        } else {
            begin = b;
            end = a;
        }

        return LongStream.rangeClosed(begin, end).sum();
    }
}
