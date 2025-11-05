package richardwollyce.maratonajava.javacore.Hheranca.test;

import richardwollyce.maratonajava.javacore.Hheranca.dominio.Endereco;
import richardwollyce.maratonajava.javacore.Hheranca.dominio.Funcionario;
import richardwollyce.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("123124-230");
        endereco.setRua("Rua 3");
        Pessoa pessoa = new Pessoa("Hermes");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Trunks");
        funcionario.setCpf("123123123");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7000);

        funcionario.imprime();
    }
}
