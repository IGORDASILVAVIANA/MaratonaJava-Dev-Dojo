package ExerciciosPOO.Abstratas.exercicio1.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome +
                ", salario=" + salario +
                '}';
    }
}
