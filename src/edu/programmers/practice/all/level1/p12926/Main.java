package edu.programmers.practice.all.level1.p12926;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        String s = "AB";
//        int n = 1;
//        String s = "z";
//        int n = 1;
        String s = "a B z";
        int n = 4;
        System.out.println(new Solution().solution(s, n));
    }
}

class Solution {

    private static char[] smallLetter;
    private static char[] capitalLetter;

    private static final StringBuilder sb = new StringBuilder();

    public String solution(String s, int n) {
        setSmallLetter();
        setCapitalLetter();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(' ');
                continue;
            }

            if (ch >= 'a') {
                findSmallLetter(ch - 'a', n);
            } else {
                findCapitalLetter(ch - 'A', n);
            }
        }

        return sb.toString();
    }

    private static void setSmallLetter() {
        smallLetter = IntStream.rangeClosed('a', 'z')
                               .mapToObj(num -> "" + (char) num)
                               .collect(Collectors.joining())
                               .toCharArray();
    }

    private static void setCapitalLetter() {
        capitalLetter = IntStream.rangeClosed('A', 'Z')
                                 .mapToObj(num -> "" + (char) num)
                                 .collect(Collectors.joining())
                                 .toCharArray();
    }

    private static void findSmallLetter(int position, int count) {
        sb.append(smallLetter[(position + count) % 26]);
    }

    private static void findCapitalLetter(int position, int count) {
        sb.append(capitalLetter[(position + count) % 26]);
    }
}
