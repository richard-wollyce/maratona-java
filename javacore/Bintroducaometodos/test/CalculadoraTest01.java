package richardwollyce.maratonajava.javacore.Bintroducaometodos.test;

import richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando soma!");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtração!");
    }
}
