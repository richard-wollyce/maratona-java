package richardwollyce.maratonajava.javacore.Bintroducaometodos.test;

import richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Lucas";
        estudante02.idade = 21;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
