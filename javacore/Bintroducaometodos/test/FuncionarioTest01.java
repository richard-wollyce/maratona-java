package richardwollyce.maratonajava.javacore.Bintroducaometodos.test;

import richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("John Doe");
        funcionario01.setIdade(42);
        funcionario01.setSalarios(new double[] {4000,2384.30,4120});

        funcionario01.imprime();
        System.out.println("Média " + (int) funcionario01.getMedia());
    }
}
