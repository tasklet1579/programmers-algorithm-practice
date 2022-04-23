package edu.programmers.practice.all.level1.p12969;

import java.util.Scanner;

public class Main {

    private static final String STAR = "*";
    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(STAR);
            }
            System.out.print(NEW_LINE);
        }
    }
}
