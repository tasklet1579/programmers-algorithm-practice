package edu.programmers.practice.kit.bfs.p1844;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(new Solution().solution(maps));
    }
}

class Solution {

    public int solution(int[][] maps) {
        int height = maps.length;
        int width = maps[0].length;
        int[][] distances = new int[height][width];
        boolean[][] visit = new boolean[height][width];

        Queue<Position> positions = new LinkedList<>();
        positions.offer(new Position(0, 0));
        distances[0][0] = 1;
        visit[0][0] = true;

        while (!positions.isEmpty()) {
            Position position = positions.poll();
            int distance = distances[position.y()][position.x()];
            int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

            for (int[] direction : directions) {
                Position next = new Position(position.x() + direction[0], position.y() + direction[1]);

                System.out.println(next.x() + " " + next.y());

                if (next.isOutOfBound(width, height)) continue;
                if (visit[next.y()][next.x()]) continue;
                if (maps[next.y()][next.x()] == 0) continue;

                positions.offer(next);
                distances[next.y()][next.x()] = distance + 1;
                visit[next.y()][next.x()] = true;
            }
        }

        int answer = distances[height - 1][width - 1];
        return answer == 0 ? -1 : answer;
    }
}

class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean isOutOfBound(int width, int height) {
        if (x < 0 || x >= width) return true;
        return y < 0 || y >= height;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }
}
