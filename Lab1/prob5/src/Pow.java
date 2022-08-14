class Prim
{
    boolean ePrim(int n){
        for ( int i=2; i<=Math.sqrt(n); i++ )
            if (n%i == 0)
                return false;
        return true;
    }
    public static void main( String args[])
    {
        for ( int i=2; i<=20; i++ )
        {
            Prim p = new Prim();
        if( p.ePrim(n) )
            System.out.println(i +"e prim");
        else
            System.out.println(i +"nu e prim");
        }
    }
}
