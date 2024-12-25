package com.maoyou.fun.advanced;

public class Warmup {
    public static void main(String[] args) {
        warmup(); //热身代码 热身场景
        realWork(); //真正执行代码
    }

    private static void realWork() {
        for (int i = 0; i < 10; i++) {
            work();
        }
    }


    private static void warmup() {
        for (int i = 0; i < 10; i++) {
            work();
        }
    }

    private static void work() {

        int a = 5;
    }


}
