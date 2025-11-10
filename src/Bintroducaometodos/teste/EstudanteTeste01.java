package Bintroducaometodos.teste;

import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.nome = "Igor";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Cintia";
        estudante2.idade = 29;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);
        System.out.println("-------------");
        estudante1.imprime();

    }
}
