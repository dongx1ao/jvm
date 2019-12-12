package com.gupao.jvm.javap;

public class Person {
    private String name = "dong";
    private static String address;
    private final static String hobby = "Programming";

    public void say() {
        System.out.println("person say...");
    }

    public static int calc(int op1, int op2) {
        op1 = 3;
        int result = op1 + op2;
        return result;
    }

    public static void order() {

    }

    public static void main(String[] args) {
        calc(1, 2);
        order();
    }
}
