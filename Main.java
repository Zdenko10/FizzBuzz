package com.engeto.lekce2;

public class Main {

    public static void main(String[] args) {

         String fizz = "Fizz";
         String buzz = "Buzz";
         String fizzbuzz = "FizzBuzz";


        for (int i = 0; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) System.out.println(fizzbuzz);
            else if (i % 3 == 0) System.out.println(fizz);
            else if (i % 5 == 0) System.out.println(buzz);
            else System.out.println(i);
        }
    }
}
