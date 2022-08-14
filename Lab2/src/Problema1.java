public class Problema1
{
        public static void main(String[] args)
        {
            String s1 = "si";
            String s2 = "sir1 si cu sir2 fac un sir3";

            int pos = 0;
            int startingPosition= 0;

            while (s2.indexOf(s1, startingPosition) != -1)
            {
                startingPosition = s2.indexOf(s1, startingPosition) + 1;
                pos ++;
            }

            System.out.println(pos);
        }
    }
