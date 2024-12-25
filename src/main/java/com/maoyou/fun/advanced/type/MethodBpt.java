package com.maoyou.fun.advanced.type;

public class MethodBpt {
    public static void main(String[] args) {
        MethodBpt.BaseInterface o = SomeWhere.getObject();

        System.out.println(o.boo());

    }

    public interface BaseInterface {
        String foo();

        String boo();
    }

    public static class Clazz1 implements MethodBpt.BaseInterface {
        @Override
        public String foo() {
            System.out.println("call foo");
            return "clazz1";
        }

        @Override
        public String boo() {
            System.out.println("call boo");
            return "clazz1";
        }
    }
}
