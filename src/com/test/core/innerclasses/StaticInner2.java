package com.test.core.innerclasses;

//If we have static method inside static inner class, no need to create object
public class StaticInner2 {
    static int data = 30;

    static class Inner {
        static void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        StaticInner2.Inner.msg();//no need to create the instance of static nested class
    }
}  