package richardwollyce.maratonajava.javacore.Bintroducaometodos.test;

import richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,5);

        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,10));
        calculadora.imprimeDivisaoDeDoisNumeros(20,20);
    }
}
