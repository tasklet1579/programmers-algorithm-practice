package edu.programmers.practice.all.level1.p12947;

public class Main {

    public static void main(String[] args) {
//        int x = 10;
//        int x = 12;
//        int x = 11;
        int x = 13;
        System.out.println(new Solution().solution(x));
    }
}

class Solution {

    public boolean solution(int x) {
        String str = String.valueOf(x);
        int number = 0;

        for (int idx = 0; idx < str.length(); idx++) {
            number += str.charAt(idx) - 48; // 48, 0x30, '0'
        }

        return x % number == 0;
    }
}
