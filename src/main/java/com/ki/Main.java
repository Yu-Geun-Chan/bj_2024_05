package com.ki;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int minute2 = sc.nextInt();

        if (hour + 1 >= 24) {
            if (minute2 < 60) {
                if (minute + minute2 >= 60) {
                    hour = hour - 23;
                    minute = (minute + minute2) % 60;
                } else {
                    minute = (minute + minute2) % 60;
                }
            } else if (minute2 >= 60) {
                if (minute + minute2 % 60 >= 60) {
                    hour = hour - 23 + (minute + minute2) / 60;
                    minute = (minute + minute2) % 60;
                } else {
                    hour = hour + (minute + minute2)  / 60;
                    minute = (minute + minute2) % 60;
                }
            }
        } else {
            if (minute2 < 60) {
                if (minute + minute2 >= 60) {
                    hour = hour + 1;
                    minute = (minute + minute2) % 60;
                } else {
                    minute = (minute + minute2) % 60;
                }
            } else if (minute2 >= 60) {
                if (minute + minute2 % 60 >= 60) {
                    hour = hour + (minute + minute2) / 60;
                    minute = (minute + minute2) % 60;
                } else {
                    hour = hour + (minute + minute2) / 60;
                    minute = (minute + minute2) % 60;
                }
            }
        }
        System.out.print(hour + " " + minute);


    }
}

