package ExerciciosPOO.Enum.exercicio1.test;

import ExerciciosPOO.Enum.exercicio1.dominio.Pedido;
import ExerciciosPOO.Enum.exercicio1.dominio.StatusPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Pedido pedido1 = new Pedido(001, "Igor", StatusPedido.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido1);



    }
}
