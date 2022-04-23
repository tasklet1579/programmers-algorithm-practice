package edu.programmers.practice.all.level1.p12901;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(new Solution().solution(a, b));
    }
}

class Solution {

    private static final int YEAR = 2016; // 윤년 leap year
    private static final int BEGIN = 0;
    private static final int END = 3;

    public String solution(int a, int b) {
        String answer = "";
        LocalDate curDate = LocalDate.of(YEAR, a, b);
        answer = curDate.getDayOfWeek().name().substring(BEGIN, END);

        // System.out.println(curDate.getYear()); // 2016
        // System.out.println(curDate.getMonth()); // MAY
        // System.out.println(curDate.getMonthValue()); // 5
        // System.out.println(curDate.getDayOfYear()); // 145
        // System.out.println(curDate.getDayOfMonth()); // 24
        // System.out.println(curDate.getDayOfWeek()); // TUESDAY

        return answer;
    }
}
