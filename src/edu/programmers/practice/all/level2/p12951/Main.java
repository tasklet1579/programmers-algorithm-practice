package edu.programmers.practice.all.level2.p12951;

public class Main {

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(new Solution().solution(s));
    }
}

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == ' ') {
                sb.append(ch);
                idx = 0;
                continue;
            }
            if (idx == 0) {
                if (ch >= 97 && ch <= 122) { // a ~ z
                    ch -= 32;
                }
                idx++;
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
