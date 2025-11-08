package richardwollyce.maratonajava.javacore.Npolimorfismo.test;

import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import richardwollyce.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import richardwollyce.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Produto produto2 = new Tomate("Tomate Americano", 20);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
