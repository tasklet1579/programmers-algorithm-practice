package edu.programmers.practice.all.level1.p12930;

public class Main {

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(new Solution().solution(s));
    }
}

class Solution {

    private static final char DELIMITER = ' ';
    private static final char Z = 'Z';
    private static final int GAP = 32; // A 65, a 97

    private static final StringBuilder sb = new StringBuilder();

    public String solution(String s) {
        String answer = "";
        int instr = 0; // 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로

        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);

            if (ch == DELIMITER) {
                instr = 0;
                sb.append(DELIMITER);
                continue;
            }

            if (instr == 0 && ch > Z) {
                sb.append((char) (ch - GAP));
            } else if (instr == 1 && ch <= Z) {
                sb.append((char) (ch + GAP));
            } else {
                sb.append(ch);
            }

            instr ^= 1;
        }

        return sb.toString();
    }
}
