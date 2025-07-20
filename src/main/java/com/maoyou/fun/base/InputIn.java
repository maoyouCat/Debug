package com.maoyou.fun.base;

import com.maoyou.fun.base.utils.SwordUtils;

import java.io.IOException;

public class InputIn {
    public static void main(String[] args) throws IOException {
        while (true) {
            int read = System.in.read();

            System.out.println("Input " + read);
            if (SwordUtils.filter(read)) {
                SwordUtils.process(read);
//                SwordUtils.process2(read);
            }
            //set Value
            //待条件的debug
        }
    }
}
