package edu.programmers.practice.all.level1.p12903;

public class Main {

    public static void main(String[] args) {
        String s = "abcde";
//        String s = "qwer";
        System.out.println(new Solution().solution(s));
    }
}

class Solution {

    public String solution(String s) {
        int length = s.length();
        if (length % 2 == 0) {
            return s.substring(length / 2 - 1, length / 2 + 1);
        }
        return s.substring(length / 2, length / 2 + 1);
    }
}
