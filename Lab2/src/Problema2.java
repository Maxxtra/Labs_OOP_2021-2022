import java.util.StringTokenizer;

public class Problema2
{
        public static int strSplit(String s1, String s2)
        {
            String[] array = s1.split(" ");
            int counter = 0;

            for (String st : array)
                if (st.equals(s2))
                    counter ++;

            return counter;
        }

        public static int tokenize(String s1, String s2)
        {
            int counter = 0;
            StringTokenizer helper = new StringTokenizer(s1, ":,.-? \n");

            while (helper.hasMoreTokens())
                if (helper.nextToken().equals(s2))
                    counter ++;

            return counter;
        }

        public static void main(String[] args)
        {
            System.out.println(strSplit("sir1 si sir2 sunt 2 siruri", "sir2"));
            System.out.println(tokenize("Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.", "ce"));
        }
}
