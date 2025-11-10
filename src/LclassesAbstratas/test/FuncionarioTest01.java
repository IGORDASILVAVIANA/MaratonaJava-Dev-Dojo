package LclassesAbstratas.test;

import LclassesAbstratas.dominio.Desenvolvedor;
import LclassesAbstratas.dominio.Funcionario;
import LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Igor", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
