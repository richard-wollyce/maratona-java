package richardwollyce.maratonajava.javacore.Aintroducaoclasses.test;

import richardwollyce.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: "+professor.idade + " sexo: "+professor.sexo);
    }
}
