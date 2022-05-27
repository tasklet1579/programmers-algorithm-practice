package edu.programmers.practice.all.level1.p12948;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        String phone_number = "01033334444";
        String phone_number = "027778888";
        System.out.println(new Solution().solution(phone_number));
    }
}

class Solution {

    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int number = phone_number.length() - 4;
        IntStream.rangeClosed(1, number).forEach(num -> sb.append("*"));
        sb.append(phone_number.substring(number));
        return sb.toString();
    }
}
