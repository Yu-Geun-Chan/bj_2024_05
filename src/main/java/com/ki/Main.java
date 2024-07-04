package com.ki;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] arr = new int[num1];

        for (int i = 1; i <= num2; i++) {
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int num5 = sc.nextInt();
            for (int j = num3; j <= num4; j++) {
                arr[j - 1] = num5;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

