package richardwollyce.maratonajava.javacore.Npolimorfismo.test;

import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Televisão;
import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import richardwollyce.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisão tv = new Televisão("Samsung 50\" ", 2500);
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
