package com.test.core.pgms;

public class fibonacci {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(fib(n));//o/p:3
    }
} 