package edu.programmers.practice.intern.coding.p49993;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA", "ABD"};
        System.out.println(new Solution().solution(skill, skill_trees));
    }
}

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            Queue<Character> skills = new LinkedList<>();

            for (char ch : skill.toCharArray()) {
                skills.offer(ch);
            }

            int add = 1;

            for (char ch : tree.toCharArray()) {
                if (!skills.contains(ch)) {
                    continue;
                }

                if (skills.peek() == ch) {
                    skills.poll();
                } else {
                    add = 0;
                    break;
                }
            }

            answer += add;
        }

        return answer;
    }
}
