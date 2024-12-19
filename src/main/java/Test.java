import fs.File;
import fs.Folder;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.addComposante(new File("Java.txt"));
        root.addComposante(new File("pom.xml"));
        Folder src  =(Folder) root.addComposante(new Folder("src"));
        src.addComposante(new File("imane.txt"));
        src.addComposante(new File("config.csv"));
        root.afficher();

    }
}
