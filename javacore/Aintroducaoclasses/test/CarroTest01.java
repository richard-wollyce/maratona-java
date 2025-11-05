package richardwollyce.maratonajava.javacore.Aintroducaoclasses.test;

import richardwollyce.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Prisma";
        carro1.modelo = "LTZ";
        carro1.ano  = 2014;

        Carro carro2 = new Carro();
        carro2.nome = "Onix";
        carro2.modelo = "Sedan";
        carro2.ano  = 2020;

        System.out.println("Carro: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println("Carro: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}
