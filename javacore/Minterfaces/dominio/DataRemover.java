package richardwollyce.maratonajava.javacore.Minterfaces.dominio;

public interface DataRemover {
    void remove();

    default void checkPermission(){
        System.out.println("Checking Permission");
    }
}
