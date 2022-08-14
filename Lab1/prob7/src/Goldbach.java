public class Goldbach {
     public static boolean isPrime(int number) {

        if (number < 2 || number % 2 == 0) {
            return (number == 2);
        }

        for (int odd = 3; odd * odd <= number; odd += 2) {
            if (number % odd == 0) {
                return false;
            }
        }

        return true;
        }

        public static void main(String[] args)
        {

            int n = 5;

            int[] primeNumbers = new int[n];

            for (int i = 1, index = 0; i <= n; i++, index++) {
                if (isPrime(i)) {
                    primeNumbers[index] = i;
                }
            }

            System.out.println("First " + n + " odd numbers are:");

            for (int i = 0; i < primeNumbers.length; i++)
            {
                if (primeNumbers[i] == 0)
                    continue;
                for (int j = i; j < primeNumbers.length; j++)
                {
                    if (primeNumbers[j] == 0)
                        continue;
                    int number = primeNumbers[i] + primeNumbers[j];
                    if (number % 2 == 0)  // conjecture only applies to even numbers
                        System.out.println( number + " = " +  primeNumbers[i] + " + " +  primeNumbers[j]);
                }
            }
        }
}

