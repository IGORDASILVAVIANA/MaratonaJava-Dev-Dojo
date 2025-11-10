package Bintroducaometodos.teste;

import Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Igor");
        funcionario.setYears(19);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimeDados();
        System.out.println("Média: "+funcionario.getMedia());

    }
}
