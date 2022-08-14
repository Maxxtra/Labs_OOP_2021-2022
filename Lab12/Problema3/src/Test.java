public class Test {
    public static void main(String[] args) {
        Channel canal = new Channel("PewDiePie");
        User user1 = new User("Eusebiu");
        User user2 = new User("Eusebiu2");
        User user3 = new User("Eusebiu3");

        canal.subscribe(user1);
        canal.subscribe(user2);
        canal.subscribe(user3);

        canal.notify("AM adaugat un nou video");
        canal.unsubscribe(user1);
        canal.notify("Am sters canalul");

    }

}
