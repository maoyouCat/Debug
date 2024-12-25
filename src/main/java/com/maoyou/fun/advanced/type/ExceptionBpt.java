package com.maoyou.fun.advanced.type;

public class ExceptionBpt {
    public static void main(String[] args) {
        SomeWhere.doSomething();
        for (int i = 0; i < 20; i++) {
            try {
                SomeWhere.doSomethingWithExp();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        int a = 1 / 0;
        System.out.println("结束!!!");
    }
}
