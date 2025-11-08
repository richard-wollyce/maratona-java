package richardwollyce.maratonajava.javacore.Npolimorfismo.test;

import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import richardwollyce.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("10/11/2025");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

        System.out.println("---------------------");
    }
}
