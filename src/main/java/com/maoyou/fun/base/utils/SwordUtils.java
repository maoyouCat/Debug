package com.maoyou.fun.base.utils;

public class SwordUtils {
    public static boolean filter(int read) {
        int i = 10;
        i = i * 2;
        i += 4;
//        int i=10;
//        i = i * 2;
//        i += 4;
//        int i=10;
//        i = i * 2;
//        i += 4;
//        int i=10;
//        i = i * 2;
//        i += 4;
        return read != '\n' && read != 'a';
    }

    public static void process(int read) {  //alt+f8
        if (Math.max(read, 90) % 2 == 0) {
            System.out.println("!");
        }
    }

    public static void process2(int arg) {
        arg = arg * 2;
        arg += 4;
        arg += 10;
        arg*=2;
        int i = 10;
        i = i * 2;
        i += 4;
        if (arg > 1) {



            arg = Math.max(10, arg);
        }
        if (Math.max(arg, 90) % 2 == 0) {
            System.out.println("!");
        }
    }
}
