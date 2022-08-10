package edu.programmers.practice.monthly.code.p68935;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 125;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {
    private static final List<Integer> nums = new LinkedList<>();
    private static final int divisor = 3;
    private static int i = 0;

    public int solution(int n) {
        int answer = 0;

        while (true) {
            if (n < divisor) {
                nums.add(n);
                break;
            } else {
                nums.add(n % divisor);
                n = n / divisor;
            }
        }

        Collections.reverse(nums);

        for (int num : nums) {
            answer += num * pow();
        }

        return answer;
    }

    public int pow() {
        return (int) Math.pow(3, i++);
    }
}
