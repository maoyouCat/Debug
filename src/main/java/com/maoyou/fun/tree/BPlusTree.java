package com.maoyou.fun.tree;


import java.util.List;

public class BPlusTree<K extends Comparable<K>, V> {
    private BPlusNode<K, V> root;

    private int order;

    private BPlusNode<K, V> head;

    private BPlusNode<K, V> tail;

    private int size;

    public BPlusTree(int order) {
        this.order = order;
        this.root = new BPlusNode<>(true, true);
        head = tail = this.root;
    }


    public void addKeyAndVal(K key, V val) {
        root.addKeyAndVal(key, val, this);
    }


    public int getOrder() {
        return order;
    }
}
