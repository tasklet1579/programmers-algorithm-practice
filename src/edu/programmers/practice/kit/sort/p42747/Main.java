package edu.programmers.practice.kit.sort.p42747;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(new Solution().solution(citations));
    }
}

class Solution {
    private int[] elements;

    public int solution(int[] citations) {
        elements = Arrays.copyOf(citations, citations.length);

        int answer = 0;
        int length = citations.length;

        quick(0, length - 1);

        for (int i = 0; i < length; i++) {
            if (elements[i] >= length - i) {
                answer = length - i;
                break;
            }
        }

        return answer;
    }

    public void quick(int begin, int end) {
        if (begin >= end) {
            return;
        }

        int pivot = elements[begin];
        int left = begin + 1;
        int right = end;

        while (left <= right) {
            if (pivot > elements[left]) {
                left++;
                continue;
            }
            if (pivot < elements[right]) {
                right--;
                continue;
            }

            swap(left++, right--);
        }

        swap(begin, right);

        quick(begin, right - 1);

        quick(right + 1, end);
    }

    public void swap(int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}
