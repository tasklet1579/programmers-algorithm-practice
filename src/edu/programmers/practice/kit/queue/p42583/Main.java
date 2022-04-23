package edu.programmers.practice.kit.queue.p42583;

public class Main {

    public static void main(String[] args) {
//        int bridge_length = 2;
//        int weight = 10;
//        int[] truck_weights = {7, 4, 5, 6};
//        int bridge_length = 100;
//        int weight = 100;
//        int[] truck_weights = {10};
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(new Solution().solution(bridge_length, weight, truck_weights));
    }
}

class Solution {

    private int[][] queue;
    private int head = 0, tail = 0;
    private int current_weight = 0;
    private int second = 0;

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int truck_number = 0, truck_count = truck_weights.length;
        queue = new int[truck_count][2];

        while (head < truck_count) { // 모든 트럭이 다리를 건널 때까지
            pop(bridge_length); // 트럭이 다리 끝에 도달했을 때 큐에서 제거한다

            if (truck_number < truck_count) { // 모든 트럭이 출발할 때까지
                if (current_weight + truck_weights[truck_number] <= weight) {
                    push(truck_weights[truck_number++]); // 트럭 출발
                }
            }

            timer(); // 1초씩 이동한다
        }

        return second;
    }

    private void push(int truck_weight) {
        queue[tail++][0] = truck_weight;
        current_weight += truck_weight;
    }

    private void pop(int finish_time) {
        if (queue[head][1] == finish_time) {
            current_weight -= queue[head][0];
            head++;
        }
    }

    private void timer() {
        for (int truck = head; truck < tail; truck++) {
            queue[truck][1] += 1;
        }
        ++second;
    }
}
