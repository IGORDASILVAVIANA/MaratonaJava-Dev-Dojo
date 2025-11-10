package Gassociacao.dominio;

public class Teacher {
    private String nome;
    private String especialidade;
    private Seminario seminarios;

    public Teacher(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if (this.seminarios != null)
            System.out.println(this.seminarios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
