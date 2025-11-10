package ExerciciosPOO.Abstratas.exercicio1.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double calculaBonus() {
        this.salario = (salario * 0.10) + this.salario;
        return this.salario;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
