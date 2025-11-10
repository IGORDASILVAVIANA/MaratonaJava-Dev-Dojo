package Aintroducaoclasses.teste;

import Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante pessoa = new Estudante();
        pessoa.nome = "Igor";
        pessoa.idade = 19;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
