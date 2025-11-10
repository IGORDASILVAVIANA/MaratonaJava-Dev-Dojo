package ExerciciosPOO.Abstratas.exercicio1.test;

import ExerciciosPOO.Abstratas.exercicio1.dominio.Desenvolvedor;
import ExerciciosPOO.Abstratas.exercicio1.dominio.Funcionario;
import ExerciciosPOO.Abstratas.exercicio1.dominio.Gerente;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class FuncionarioTest {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Gerente gerente = new Gerente("Micael", 7000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Igor", 10000);

        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.equals(gerente) || funcionario.equals(desenvolvedor)){
                funcionario.calculaBonus();
                System.out.println(funcionario);
            }else
                System.out.println("Sem direito a bônus");
        }
    }
}
