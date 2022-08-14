/*
Nu mi-a iesit: V get
*/


import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    Vector<K> keys;
    Vector<V> values;

    public ArrayMap() {
        this.keys = new Vector<>();
        this.values = new Vector<>();
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < keys.size(); ++i) {
            ans.append("Key: ").append(keys.get(i)).append(" Value: ").append(values.get(i)).append('\n');
        }

        return ans.toString();
    }

    @Override
    public V put(K key, V value) {
        if (get(key) != null)
        {
            int index = keys.indexOf(key);
            values.set(index, value);
            return value;
        }

        keys.add(key);
        values.add(value);

        return value;
    }

    @Override
    public V get(Object key) {}

    public Set<K> keySet() {
        return new HashSet<>(keys);
    }

    public Collection<V> values() {
        return new ArrayList<>(values);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        HashSet<Map.Entry<K,V>> hs = new HashSet<>();

        for (int i = 0; i < keys.size(); i++) {
            hs.add(new ArrayMap<>(keys.get(i), values.get(i)));
        }

        return hs;
    }

}
