package richardwollyce.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        byte diaDaSemana = 4;
        switch (diaDaSemana) {
            default -> throw new IllegalArgumentException("Unexpected value: "+diaDaSemana);
            case 1,7 -> System.out.println("Fim de Semana");
            case 2,3,4,5,6 -> System.out.println("Dia Útil");
        }
    }
}
