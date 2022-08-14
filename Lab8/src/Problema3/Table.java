package Problema3;

import java.util.*;
//am gasit ceva pe net si cred ca mi-a dat bine

public class Table {
    Vector<Vector<Object>> table;

    public Table() {
        this.table = new Vector<Vector<Object>>();
    }

    public Table(Object [][] table) {
        this.table = new Vector<Vector<Object>>();

        for (int i = 0; i < table.length; ++i) {
            this.table.add(new Vector<>());
            for (int j = 0; j < table[0].length; ++j) {
                this.table.get(i).add(table[i][j]);
            }
        }
    }

    public void print(CsvPrinter csv) {
        for (Vector<Object> vect : this.table) {
            StringBuilder ans = new StringBuilder();

            for (Object obj : vect) {
                if (vect.indexOf(obj) != vect.size() - 1) {
                    ans.append(obj).append(csv.delimiter);
                } else {
                    ans.append(obj);
                }
            }

            System.out.println(ans.toString());
        }
    }

    public void print(AsciiPrinter asc) {
        for (Vector<Object> vect : this.table) {
            int counter = 0;
            for (Object obj : vect) {
                StringBuilder ans = new StringBuilder();
                ans.append(" ");

                if (obj.toString().length() == asc.sizes[counter]) {
                    ans.append(obj);
                    ans.append("|");
                } else {
                    int len = asc.sizes[counter] - obj.toString().length();
                    ans.append(obj);

                    while (len != 0) {
                        ans.append(" ");
                        len--;
                    }

                    ans.append("|");
                }

                System.out.print(ans.toString());
                counter++;
            }
            System.out.println();
        }
    }

    class AsciiPrinter {
        int[] sizes;

        public AsciiPrinter(int[] sizes) {
            this.sizes = sizes;
        }
    }

    class CsvPrinter {
        String delimiter;

        public CsvPrinter() {
            this.delimiter = ",";
        }

        public CsvPrinter(String delimiter) {
            this.delimiter = delimiter;
        }
    }
}