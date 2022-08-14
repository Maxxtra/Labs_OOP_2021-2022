

public class Filtru implements FilenameFilter {
    Vector<String> words;
    Vector<String> names;

    public Filtru() {
        this(new Vector<>(), new Vector<>());
    }

    public Filtru(Vector<String> dirs, Vector<String> names) {
        this.words = dirs;
        this.names = names;
    }

    public void addWord(String word) {
        this.words.add(word);
    }

    public void addName(String name) {
        this.names.add(name);
    }

    @Override
    public boolean accept(File dir, String name) {
        boolean q1 = false, q2 = false;

        for (String nam : words) {
            if (name.contains(nam)) {
                q1 = true;
                break;
            }
        }

        System.out.println(name);

        for (String nam : names) {
            if (name.endsWith(nam)) {
                q2 = true;
                break;
            }
        }

        return q1 && q2;
    }

    @Override
    public String toString() {
        return this.words.toString() + this.names.toString();
    }
}