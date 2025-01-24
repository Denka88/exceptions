package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeException {


//        ex1
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(div(a, b));*/

//        ex2
        /*int age = 15;
        try{
            if(age < 18){
                throw new AgeException();
            }
        }catch (AgeException e){
            throw new RuntimeException(e);
        }*/

//        ex3
        /*Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try{
            int num = Integer.parseInt(text);
        }
        catch (NumberFormatException e){
            throw new RuntimeException(e);
        }*/

        int[] arr = {1, 2, 3, 4, 5};
        itemFromArray(arr, 3);
    }

    static void itemFromArray(int[] arr, int value) throws ArrayIndexOutOfBoundsException{
        try{
            for (int i = 0; i != value; i++) {

                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException(e);
        }
    }

    static double div(int a, int b) throws ArithmeticException {
        double res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        return res;
    }
}