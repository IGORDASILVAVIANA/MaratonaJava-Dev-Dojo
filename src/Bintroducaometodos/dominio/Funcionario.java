package Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int years;
    private double[] salarios;
    private double media;

    public void imprimeDados(){
        System.out.println(this.name);
        System.out.println(this.years);
        for (double salario: salarios){
            System.out.print(salario + "   ");
        }
        mediaSalario();
    }

    public void mediaSalario(){
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial "+ media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
