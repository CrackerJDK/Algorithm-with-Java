package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 3;
        int number1 = 0;
        int number2 = 1;
        System.out.println("We have a Fibonacci Sequence: ");
        System.out.printf("0; 1; ");
        while(count<=30){

            System.out.printf((number1 + number2) + "; ");
            int temp=number2;
            number2=number1+number2;
            number1=temp;
            count++;
        }
    }
}
