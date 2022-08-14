import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File fisier = new File("./src/com/Lab12");

        File[] objects = fisier.listFiles();
        Director director = new Director("./src/com/Lab12");
        Cat cat = new Cat();

        assert objects != null;
        for (File file : objects) {
            director.addChild(new Fisier("./src/com/Lab12/" + file.getName()));
        }

        ((Fisier)director.getChildren().get(0)).accept(cat);
    }
}
