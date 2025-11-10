package ExerciciosPOO.Abstratas.exercicio1.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    private double desconto = 0.20;

    @Override
    public double calculaBonus() {
        this.salario = (salario * 0.20) + this.salario;
        return this.salario;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome  +
                ", salario=" + salario +
                '}';
    }

    public double getDesconto() {
        return desconto;
    }
}
