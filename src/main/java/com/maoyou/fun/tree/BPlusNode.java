package com.maoyou.fun.tree;

import java.util.ArrayList;
import java.util.List;

public class BPlusNode<K extends Comparable<K>, V> {

    private boolean isleaf;
    private boolean isRoot;
    private List<K> keys;
    private List<V> data;
    private List<BPlusNode<K, V>> children;

    public BPlusNode(boolean isleaf, boolean isRoot) {
        this(isleaf);
        this.isRoot = isRoot;
        this.keys = new ArrayList<>();
    }

    public BPlusNode(boolean isleaf) {
        this.isleaf = isleaf;
        if (isleaf) {
            data = new ArrayList<>();
        }
    }

    /**
     * 节点添加：
     * 区分是否是叶子节点
     * 如果是叶子节点，直接增加或者替换节点的元素，节点元素超过(order-1),分裂为left和right节点,选取right的第一个元素上升到父节点
     * 父节点是根元素
     * 父节点不是根元素
     *
     * @param key
     * @param val
     * @param tree
     */
    public void addKeyAndVal(K key, V val, BPlusTree<K, V> tree) {
        if (isleaf) {
            if (contains(key) != -1 || keys.size() < (tree.getOrder() - 1)) {
                addKeyAndVal(key, val);
                return;
            }
        }

    }

    private int contains(K key) {
        int low = 0, high = keys.size() - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int cmp = keys.get(mid).compareTo(key);
            if (cmp == 0) {
                return mid;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private void addKeyAndVal(K key, V val) {
        int low = 0, high = keys.size() - 1; // [2,3,4]
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int cmp = keys.get(mid).compareTo(key);
            if (cmp == 0) {
                keys.set(mid, key);
                data.set(mid, val);
                break;
            } else if (cmp > 0) {
                high = mid - 1; //high=-1
            } else {
                low = mid + 1; //low=3
            }
        }
        if (low > high) {
            keys.add(low, key);
            data.add(low, val);
        }

    }
}
