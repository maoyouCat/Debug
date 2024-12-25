package com.maoyou.fun.advanced;

public class Cache {
    private static Cache instance;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getInstance(i));
        }
    }

    static Cache getInstance(int i) {
        if (instance == null) { //暂停的debug 单击  黄色的debug shift+单击
            instance = new Cache();
        }
        return instance;
    }
}
