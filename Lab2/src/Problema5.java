public class Problema5 {

    public String cenzurare(String text, String[] cuvinte)
    {
        boolean check = true;

        StringBuffer text1 = new StringBuffer(text);

        for (String contor : cuvinte)
        {
            int index = 0;
            while (text.indexOf(contor, index) != -1)
            {
                check = false;
                index = text.indexOf(contor, index);
                for (int i = 1; i < contor.length() - 1; i++)
                    text1.setCharAt(i + index, '*');
                index ++;
            }
        }

        if (check == true)
            System.out.println("Nimic suspect");
         else
            System.out.println("Text suspect");

        return text1.toString();
    }
    public static void main(String[] args)
    {
        String text = "Un terorist avea o bomba";
        String cuvinte[] = new String[2];
        cuvinte[0] = "terorist";
        cuvinte[1] = "bomba";
        Problema5 prb5 = new Problema5();
        String rezultat;
        rezultat = prb5.cenzurare(text, cuvinte);

        System.out.println(rezultat);
    }
}
