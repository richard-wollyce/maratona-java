package richardwollyce.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long bigNumber = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2000f;
        byte ageByte = -128;
        short ageShort = 32000;
        boolean TTrue = true;
        boolean FFake = false;
        char character = '\u0041';
        String name = "Richard";

        System.out.println("Age: "+age);
        System.out.println("Salary: "+salaryFloat);
        System.out.println("Employed: "+TTrue);
        System.out.println("Hello, "+name+"!");
    }
}
