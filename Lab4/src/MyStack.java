public class MyStack {
    Array array;

    public MyStack() {
        array = new Array();
    }

    public void push(Integer x) {
        array.addElement(x);
    }

    public Integer pop() {
        return array.remove(array.getSize() - 1);
    }
}