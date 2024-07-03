package com.ki;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers =  new int[num];

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            numbers[i] = a;
        }
        int num2 = sc.nextInt();
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (num2 == numbers[i]) {
                j++;
            }
        }
        System.out.println(j);
    }
}

