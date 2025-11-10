package Bintroducaometodos.teste;

import Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divideDoisNumeros(0,5));
        System.out.println("--------");
        calculadora.imprimeDivisaoDeDoisNumeros(10,0);
    }
}
