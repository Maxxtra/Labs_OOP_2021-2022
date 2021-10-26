import java.util.Hashtable;
import java.util.Set;

public class HSet extends  Hashtable<Object, Object>{

    public boolean add(Object value) {
        if (contains(value)) {
            return false;
        }

        put(value, value);
        return true;
    }



    @Override
    public Object remove(Object value) {
        Object obj = get(value);
        super.remove(value);

        return value;
    }

    @Override
    public String toString() {
        StringBuffer ans = new StringBuffer();
        Set<Object> keys = this.keySet();

        for (Object key : keys) {
            ans.append(key);
            ans.append(", ");
        }

        return ans.toString();
    }
}
