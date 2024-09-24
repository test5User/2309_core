package _03_xml._04_jaxb;

import static _03_xml._04_jaxb.utils.CatUtils.*;

public class Main {
    public static void main(String[] args) {
        var cats = readFile();

        print(cats);

        writeFile(cats);
    }
}
