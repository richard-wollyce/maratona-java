package richardwollyce.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        int result = number01 * number02;
        System.out.println(result);

        int resto = 20 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);

        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("MaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("MenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("É comprável "+isPlaystationCincoCompravel);

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        int contador = 0;
        contador++;
        System.out.println(contador);

    }
}
