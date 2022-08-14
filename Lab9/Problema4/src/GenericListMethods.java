import java.util.*;

public class GenericListMethods implements GenericInterface {

    @Override
    public <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    @Override
    public <E extends Comparable<E>> E max(ArrayList<E> list) {
        return Collections.max(list);
    }

    @Override
    public <E extends Comparable<E>> int binarySearch(ArrayList<E> list, E key, int start, int end) {
        if (list.size() == 0)
            return -1;


        Collections.sort(list);

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid).compareTo(key) == 0)
                return mid;
            else if (list.get(mid).compareTo(key) >= 0)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
