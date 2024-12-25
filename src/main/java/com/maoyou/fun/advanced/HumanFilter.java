package com.maoyou.fun.advanced;

import java.util.Arrays;
import java.util.List;

public class HumanFilter {

    public static class Human {
        private int age = 0;
        private final String name;

        public Human(String name) {
            this.name = name;
        }

        void incrementAge() {
            age++;
        }
    }

    public static void main(String[] args) {
        List<Human> list = Arrays.asList(new Man("Jack"),
                new Woman("Juli"),
                new Man("Tom"));

        for (int i = 0; i < 10; i++) {
            for (Human human : list) {
                human.incrementAge();
                System.out.println(human.name); //alt+F8
            }
        }
    }


    static class Man extends Human {

        public Man(String name) {
            super(name);
        }
    }


    static class Woman extends Human {

        public Woman(String name) {
            super(name);
        }
    }
}
