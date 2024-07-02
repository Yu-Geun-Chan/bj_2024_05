package com.ki;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            int a G= sc.nextInt();
            int b = sc.nextInt();
            sum = a + b;
            System.out.printf("Case #%d: %d + %d = %d\n" , i, a, b, sum);
        }
    }
}