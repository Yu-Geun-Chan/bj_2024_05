package com.ki;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = num;

        for (int i = 1; i <= num; i++) {
            System.out.print(" ".repeat(sum - 1));
            sum -= 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}