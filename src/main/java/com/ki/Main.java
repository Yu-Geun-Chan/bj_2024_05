package com.ki;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int minute2 = sc.nextInt();
        int minute3 = minute + minute2;

        if (minute3 >= 60) {
            hour = hour + minute3 / 60;
            minute = minute3 % 60;
        } else if (minute3 < 60) {
            minute = minute3;
        }
        hour = hour % 24;

        System.out.print(hour + " " + minute);
    }
}

