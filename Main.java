public class Main {

    public static void main(String[] args) {
        //task 1

        System.out.println("TASK 1 ==================================================");
        double pi = 3.14;
        Paralelogram paralelogram = new Paralelogram(2, 3, pi / 6, 5 * pi / 6);
        Patrat patrat = new Patrat(20, pi / 2);
        Romb romb = new Romb(1, pi / 6, 5 * pi / 6);
        Dreptunghi dreptunghi = new Dreptunghi(20, 30, pi / 2);

        System.out.println(dreptunghi.arie());
        System.out.println(patrat.arie());
        System.out.println(paralelogram.arie());
        System.out.println(romb.arie());

        //task 2

        System.out.println("TASK 2 ==================================================");
        SortedArray sortedArray = new SortedArray();

        sortedArray.addElement(3);
        sortedArray.addElement(1);
        sortedArray.addElement(6);
        sortedArray.addElement(2);

        System.out.println(sortedArray.toString());

        MyStack myStack = new MyStack();

        myStack.push(3);
        myStack.push(1);
        myStack.push(5);
        myStack.push(7);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        //task 3

    }
}