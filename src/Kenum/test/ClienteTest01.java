package Kenum.test;

import Kenum.dominio.Cliente;
import Kenum.dominio.TipoCliente;
import Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Igor", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Igor", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        TipoCliente tipoCliente = TipoCliente.tipoClientePorRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
