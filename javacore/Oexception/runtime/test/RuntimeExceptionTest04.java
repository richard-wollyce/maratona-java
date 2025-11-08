package richardwollyce.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
//        try {
//            talvezLanceException();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
