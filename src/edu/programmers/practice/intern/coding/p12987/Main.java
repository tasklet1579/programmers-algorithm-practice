package edu.programmers.practice.intern.coding.p12987;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {5, 1, 3, 7};
        int[] B = {2, 2, 6, 8};
        System.out.println(new Solution().solution(A, B));
    }
}

class Solution {

    public int solution(int[] A, int[] B) {
        int answer = 0;
        int a = A.length - 1;
        int b = B.length - 1;

        Arrays.sort(A);
        Arrays.sort(B);

        while (a >= 0) {
            if (A[a] < B[b]) {
                b--;
                answer++;
            }
            a--;
        }

        return answer;
    }
}
