package com.maoyou.fun.base;

import com.maoyou.fun.base.utils.SwordUtils;

import java.io.IOException;

public class InputIn {
    public static void main(String[] args) throws IOException {
        while (true) {
            int read = System.in.read();//声明的地方
            System.out.println("Input " + read);
            if (SwordUtils.filter(read)) { //最近的使用的地方
//                SwordUtils.process(read); //alt+单击
                SwordUtils.process2(read);
            }
            //set Value
            //待条件的debug
        }
    }
}
