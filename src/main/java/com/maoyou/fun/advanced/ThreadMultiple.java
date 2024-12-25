package com.maoyou.fun.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadMultiple {
    public static void main(String[] args) throws InterruptedException {
        assertSame(1, work().size());
    }


    private static List<Integer> work() throws InterruptedException {
        String name = "1";
        final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        Thread thread = new Thread(() -> addIfAbsent(list, 17));
        thread.start();
        addIfAbsent(list, 17);
        thread.join();
        System.out.println("Elements: " + list);
        return list;
    }

    private static void addIfAbsent(List<Integer> list, int x) {
        synchronized (list) {
            if (!list.contains(x)) {
                list.add(x);
            }
        }
    }

    private static boolean assertSame(int x, int y) {
        if (x != y) {
            System.out.println("error");
        } else {
            System.out.println("normal");
        }
        return x == y;
    }

}
