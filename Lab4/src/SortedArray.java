public class SortedArray extends Array {
    public SortedArray() {
        super();
    }

    @Override //specificator
    public void addElement(Integer x) {
        super.addElement(x);
        super.sort();
    }
}