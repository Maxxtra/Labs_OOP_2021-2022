public class Test {
    public static void main(String[] args) {
        Pensionar p1 = new Pensionar((float) 2000.3, 25, new TwentyStrategy());
        Pensionar p2 = new Pensionar((float) 2000.3, 35, new ThirtyStrategy());
        Pensionar p3 = new Pensionar((float) 2000.3, 45, new FortyStrategy());

        System.out.println(p1.getPensie());
        System.out.println(p2.getPensie());
        System.out.println(p3.getPensie());
    }
}
