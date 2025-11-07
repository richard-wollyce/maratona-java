package richardwollyce.maratonajava.javacore.Kenum.test;

import richardwollyce.maratonajava.javacore.Kenum.dominio.Cliente;
import richardwollyce.maratonajava.javacore.Kenum.dominio.TipoCliente;
import richardwollyce.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import java.sql.SQLOutput;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
