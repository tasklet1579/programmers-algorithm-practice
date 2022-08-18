package edu.programmers.practice.tips.town.p12973;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String s = "cdcd";
        System.out.println(new Solution().solution(s));
    }
}

class Solution {
    private final Stack<Character> chs = new Stack<>();

    public int solution(String s) {
        char rem = ' ';

        for (char ch : s.toCharArray()) {
            if (chs.size() >= 1 && rem == ch) {
                chs.pop();
                rem = chs.size() == 0 ? ' ' : chs.peek();
            } else {
                chs.push(ch);
                rem = ch;
            }
        }

        return chs.size() == 0 ? 1 : 0;
    }
}
