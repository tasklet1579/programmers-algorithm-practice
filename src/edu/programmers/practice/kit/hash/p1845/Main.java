package edu.programmers.practice.kit.hash.p1845;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println(new Solution().solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> pokemons = new HashMap<>();

        for (int num : nums) {
            int size = pokemons.getOrDefault(num, 0);
            pokemons.put(num, size + 1);
        }

        return Math.min(pokemons.size(), nums.length / 2);
    }
}
