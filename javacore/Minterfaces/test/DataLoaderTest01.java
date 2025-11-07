package richardwollyce.maratonajava.javacore.Minterfaces.test;

import richardwollyce.maratonajava.javacore.Minterfaces.dominio.DataRemover;
import richardwollyce.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import richardwollyce.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        fileLoader.checkPermission();
    }
}
