package richardwollyce.maratonajava.javacore.Gassociacao.test;

import richardwollyce.maratonajava.javacore.Gassociacao.dominio.Aluno;
import richardwollyce.maratonajava.javacore.Gassociacao.dominio.Local;
import richardwollyce.maratonajava.javacore.Gassociacao.dominio.Professor;
import richardwollyce.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("João", 17);
        Professor professor = new Professor("José", "Engenheiro");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Tecnologia no Século XXI", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
