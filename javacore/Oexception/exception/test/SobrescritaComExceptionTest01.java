package richardwollyce.maratonajava.javacore.Oexception.exception.test;

import richardwollyce.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import richardwollyce.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import richardwollyce.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
