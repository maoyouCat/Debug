package com.maoyou.fun.advanced.type;

import java.util.Random;

public class FieldBpt {
    static int fi = new Random().nextInt(100);

    public static void main(String[] args) {
        SomeWhere.doSomething(fi);
        if (fi > 5) {
            System.out.println("这个数很大:" + fi);
        } else {
            System.out.println("这个数很小:" + fi);
        }
    }

    void foo0() {
        fi = 0;
    }

    void foo1() {
        fi = 1;
    }

    void foo2() {
        fi = 2;
    }

    void foo3() {
        fi = 3;
    }

    void foo4() {
        fi = 4;
    }

    void foo5() {
        fi = 5;
    }

    void foo6() {
        fi = 6;
    }

    void foo7() {
        fi = 7;
    }

    void foo8() {
        fi = 8;
    }

    void foo9() {
        fi = 9;
    }

    void foo10() {
        fi = 10;
    }

}
