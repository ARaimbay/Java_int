package org.example;
public class Main {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome");

        for (int i = 1; i <= 100; i++) {
            int fib = fibonacci(i);
            System.out.println("Fib i = " + i + " = " + fib);
        }
    }
}