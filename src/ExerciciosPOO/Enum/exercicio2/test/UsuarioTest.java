package ExerciciosPOO.Enum.exercicio2.test;

import ExerciciosPOO.Enum.exercicio2.dominio.NivelUsuario;
import ExerciciosPOO.Enum.exercicio2.dominio.Usuario;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Igor", NivelUsuario.ADMIN);
        Usuario usuario2 = new Usuario("Cintia", NivelUsuario.MODERADOR);
        Usuario usuario3 = new Usuario("Micael", NivelUsuario.USUARIO);

        usuario.podeExcluir();
        usuario2.podeExcluir();
        usuario3.podeExcluir();
    }
}
