package edu.programmers.practice.all.level1.p12937;

public class Main {

    public static void main(String[] args) {
        int num = 3;
//        int num = 4;
        System.out.println(new Solution().solution(num));
    }
}

class Solution {

    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
