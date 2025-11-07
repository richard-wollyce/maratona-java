package richardwollyce.maratonajava.javacore.Jmodificadorfinal.test;

import richardwollyce.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
