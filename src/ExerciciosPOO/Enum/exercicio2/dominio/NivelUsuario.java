package ExerciciosPOO.Enum.exercicio2.dominio;

import java.util.ArrayList;

public enum NivelUsuario {
    ADMIN(1), MODERADOR(2), USUARIO(3);
    private int id;

    NivelUsuario(int id) {
        this.id = id;
    }

}
