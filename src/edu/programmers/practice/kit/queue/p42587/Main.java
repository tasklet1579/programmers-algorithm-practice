package edu.programmers.practice.kit.queue.p42587;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
	    System.out.println(new Solution().solution(priorities, location));
    }
}

class Solution {

    private PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder()); // 중요도가 높은 문서부터
    private Queue<Document> queue = new LinkedList<>();

    public int solution(int[] priorities, int location) {
        int printing = 0;

        for (int idx = 0; idx < priorities.length; idx++) {
            priority.add(priorities[idx]);

            if (idx == location) {
                queue.add(new Document(priorities[idx], 1)); // 내가 인쇄를 요청한 문서
            } else {
                queue.add(new Document(priorities[idx]));
            }
        }

        while (true) {
            Document doc = queue.poll();

            if (doc.getPriority() == priority.peek()) {
                printing++;

                if (doc.getLocation() == 1) {
                    break;
                }

                priority.poll();
            }

            queue.add(doc);
        }

        return printing;
    }
}

class Document {

    private int priority;
    private int location;

    public Document(int priority) {
        this.priority = priority;
        this.location = 0;
    }

    public Document(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }

    public int getPriority() {
        return priority;
    }

    public int getLocation() {
        return location;
    }
}
