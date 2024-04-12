package com.github.puregero.orderbookdemo.orderbook;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * A list of key-value pairs that is sorted by the key. This maximum number of pairs in this list is defined by maxSize.
 * If the number of pairs exceeds maxSize, the smallest key-value pair will be removed to make space for a new pair.
 * The smallest key-value pair is determined by the given comparator.
 */
public class PriceQuantityList<K, V> {

    private final SortedMap<K, V> list;
    private final int maxSize;
    private final Comparator<K> comparator;

    public PriceQuantityList(int maxSize, Comparator<K> comparator) {
        this.maxSize = maxSize;
        this.comparator = comparator;
        this.list = new TreeMap<>(this.comparator);
    }

    /**
     * Puts a key-value pair into the list.
     * This key-value pair will not be put into the list if its key is outside the range of the list.
     * The smallest key may be removed to make space for this new key-value pair.
     * @param key The key
     * @param value The value
     * @return true if the key-value pair was put into the list, false if the key was outside the range
     */
    public boolean put(K key, V value) {
        if (!keyIsInRange(key)) {
            // Key is outside the range of the list, don't add it
            return false;
        }

        list.put(key, value);

        checkListIsWithinSize(); // Ensure the list is still within the size limit after adding a new key

        return true;
    }

    public boolean keyIsInRange(K key) {
        return list.size() < maxSize // List is not full, has space for more keys
                || comparator.compare(key, list.lastKey()) <= 0; // Key is bigger than the smallest key in the list
    }

    private void checkListIsWithinSize() {
        if (list.size() > maxSize) {
            // The last element is now outside the range of the list, remove it
            list.remove(list.lastKey());
        }
    }

    public void remove(K key) {
        list.remove(key);
    }

    public boolean containsKey(K key) {
        return list.containsKey(key);
    }

    public int size() {
        return list.size();
    }

    public V get(K key) {
        return list.get(key);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return list.entrySet();
    }
}
