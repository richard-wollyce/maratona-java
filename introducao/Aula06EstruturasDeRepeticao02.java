package richardwollyce.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1000000
        for(int i=0; i<=1000000; i+=2) {
            if (i % 2 == 0)
            System.out.println(i);
        }
    }
}
