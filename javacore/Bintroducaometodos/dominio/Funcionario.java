package richardwollyce.maratonajava.javacore.Bintroducaometodos.dominio;
public class Funcionario {
        private String nome;
        private int idade;
        private double[] salarios = new double[3];

        private double media = 0;

        public void imprime(){
            System.out.println(this.getNome());
            System.out.println(this.getIdade());
            if (salarios == null) {
                return;
            }
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
            imprimeMediaSalario();
        }

        public void imprimeMediaSalario() {
            if (salarios == null) {
                return;
            }

            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("\nMédia Salarial " + media);
        }
    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}