package richardwollyce.maratonajava.javacore.Bintroducaometodos.test;

import richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "João";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Lucas";
        estudante02.idade = 21;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
