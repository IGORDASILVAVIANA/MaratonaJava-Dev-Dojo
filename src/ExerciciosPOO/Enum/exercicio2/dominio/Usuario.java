package ExerciciosPOO.Enum.exercicio2.dominio;

public class Usuario {
    private String nome;
    private NivelUsuario nivelUsuario;

    public Usuario(String nome, NivelUsuario nivelUsuario) {
        this.nome = nome;
        this.nivelUsuario = nivelUsuario;
    }

    public void podeExcluir(){
        if (nivelUsuario.equals(NivelUsuario.ADMIN) || nivelUsuario.equals(NivelUsuario.MODERADOR)){
            System.out.println("Você tem a permissão de excluir usuários");
        }
        System.out.println("Você é um usuário comum!");;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelUsuario getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(NivelUsuario nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }
}
