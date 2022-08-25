package edu.programmers.practice.kit.bfs.p43164;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "AAA"}, {"ICN", "CCC"}, {"CCC", "DDD"}, {"AAA", "BBB"}, {"AAA", "BBB"}, {"DDD", "ICN"}, {"BBB", "AAA"}};
        System.out.println(Arrays.toString(new Solution().solution(tickets)));
    }
}

class Solution {
    private static final Deque<String[]> airports = new LinkedList<>();
    private static final List<String[]> answer = new LinkedList<>();
    private static String[][] tickets;
    private static int[] visit;

    public String[] solution(String[][] tickets) {
        Solution.tickets = tickets;
        Solution.visit = new int[tickets.length];
        int v = 0;

        for (String[] ticket : tickets) {
            if ("ICN".equals(ticket[0])) {
                airports.offer(ticket);
                visit[v] = 1;
                find(1, ticket[1]);
                airports.removeLast();
                visit[v] = 0;
            }
            v++;
        }

        answer.sort(Comparator.comparing(Arrays::toString));

        return answer.get(0);
    }

    public void find(int depth, String next) {
        if (depth == tickets.length) {
            Deque<String> deque = new LinkedList<>();

            for (String[] airport : airports) {
                if (deque.isEmpty() || !deque.peekLast().equals(airport[0])) {
                    deque.offer(airport[0]);
                }
                deque.offer(airport[1]);
            }

            answer.add(deque.toArray(new String[0]));
            return;
        }

        int v = 0;

        for (String[] ticket : tickets) {
            if (visit[v] == 0) {
                if (next.equals(ticket[0])) {
                    airports.offer(ticket);
                    visit[v] = 1;
                    find(depth + 1, ticket[1]);
                    airports.removeLast();
                    visit[v] = 0;
                }
            }
            v++;
        }
    }
}
