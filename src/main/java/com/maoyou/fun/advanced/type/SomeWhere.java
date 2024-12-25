package com.maoyou.fun.advanced.type;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class SomeWhere {
    public static MethodBpt.BaseInterface getObject() {
        Clazz3 obj = new Clazz3();
        doSome(obj);
        return obj;
    }

    private static void doSome(Clazz3 obj) {
        try {
            String name = "foo";
            obj.getClass().getMethod(name).invoke(obj);
            //日志
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSomething(int fi) {
        Random random = new Random();
        FieldBpt fieldBpt = new FieldBpt();
        for (int i = 0; i < 10; i++) {
            Class<? extends FieldBpt> aClass = fieldBpt.getClass();
            if (random.nextBoolean()) {
                try {
                    aClass.getDeclaredMethod("foo" + i).invoke(fieldBpt);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static int doSomethingWithExp() {
        Object a = null;
        Object b = new Object();
        int x = 1, y = 0, z = Integer.MAX_VALUE;

        switch (new Random().nextInt(5)) {
            case 0:
                return Math.floorDiv(x, y);
            case 1:
                return a.hashCode();
            case 3:
                return Integer.parseInt("xxxx");
            case 4:
                return ((String) b).length();

        }
        return x;

    }

    public static void doSomething() {
        try {
            doSomethingWithExp();
        } catch (Exception e) {
            System.out.println("不关心的异常");
        }
    }


    public static class Clazz2 extends MethodBpt.Clazz1 {
        @Override
        public String foo() {
            System.out.println("call foo");
            return "clazz2";
        }
    }

    public static class Clazz3 extends Clazz2 {
        @Override
        public String foo() {
            System.out.println("call foo");
            return "clazz3";
        }
    }


}
