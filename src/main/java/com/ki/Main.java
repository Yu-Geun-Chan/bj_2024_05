package com.ki;


import java.util.Scanner;
//        5 4 -> 5 = 1 ~ 5번까지 바구니, 4 = 4번 뒤집어라
//        1 2 -> 1 ~ 2번 바구니 뒤집어라
//        3 4 -> 3 ~ 4번 바구니 뒤집어라
//        1 4 -> 1 ~ 4번 바구니 뒤집어라
//        2 2 -> 2 ~ 2번 바구니 뒤집어라

//            1 2 3 4 5 초기상태
//            2 1 3 4 5
//            2 1 4 3 5
//            3 4 1 2 5
//            3 4 1 2 5

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a; // i번째 바구니
        int b; // j번째 바구니
        int[] basket = new int[n]; // 바구니 배열
        int[] reverse = new int[n]; // 뒤집는거 넣는 배열

        for (int i = 0; i < n; i++) {
            basket[i] = i+1; // 배열은 0부터 숫자는 1부터 시작이므로 +1
        }

        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                reverse[a + b - j - 1] = basket[j - 1]; // 숫자는 1부터 시작 배열은 0부터 시작, 따라서 -1 해야됨
            }
            for (int j = a; j <= b; j++) {
                basket[j - 1] = reverse[j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}





