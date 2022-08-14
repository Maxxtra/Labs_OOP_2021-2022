import java.util.Arrays;
public class Random {
    public static void main( String args[] )
    {
        int min = 0;
        int max = 100;

        //Generate random double value from 0 to 100
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double numbers[] = new double[20];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = Math.random()*(max-min+1)+min;

        // Calling the sort() method present inside Arrays class
        Arrays.sort(numbers);
        // Printing and display sorted array
        System.out.printf("Modified arr[] : %s", Arrays.toString(numbers));

        System.out.println();
        double key = 30.098665;
        int result = Arrays.binarySearch(numbers,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}  