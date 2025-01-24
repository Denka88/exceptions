package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(div(a, b));
    }

//    ex1
    static double div(int a, int b) throws ArithmeticException {
        double res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        return res;
    }

//    ex2

}