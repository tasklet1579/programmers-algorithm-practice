package edu.programmers.practice.all.level1.p12915;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(new Solution().solution(strings, n)));
    }
}

class Solution {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (str1, str2) -> {
            int comp = str1.charAt(n) - str2.charAt(n);
            if (comp == 0) {
                return str1.compareTo(str2);
            } else {
                return comp;
            }
        });

        return strings;
    }
}
