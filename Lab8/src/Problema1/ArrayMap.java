package Problema1;

import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    ArrayList<ArrayMapEntry<K, V>> mp;

    public ArrayMap() {
        mp = new ArrayList<>();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new HashSet<Map.Entry<K, V>>(mp);
    }

    public int size() {
        return mp.size();
    }

    @Override
    public V put(K key, V value) {
        mp.add(new ArrayMapEntry<>(key, value));
        return value;
    }

    static class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof ArrayMapEntry)) return false;

        @Override
        public int hashCode() {
            return (this.getKey()==null   ? 0 : this.getKey().hashCode()) ^
                    (this.getValue()==null ? 0 : this.getValue().hashCode());
        }

        @Override
        public String toString() {
            return "Key: " + this.key + " Value: " + this.value + '\n';
        }
    }
}