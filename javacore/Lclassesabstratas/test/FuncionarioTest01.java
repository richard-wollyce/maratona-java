package richardwollyce.maratonajava.javacore.Lclassesabstratas.test;

import richardwollyce.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import richardwollyce.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import richardwollyce.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Shen", 12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
