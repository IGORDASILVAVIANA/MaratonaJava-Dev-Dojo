package ExerciciosPOO.Abstratas.exercicio2.test;

import ExerciciosPOO.Abstratas.exercicio2.dominio.Animal;
import ExerciciosPOO.Abstratas.exercicio2.dominio.Cachorro;
import ExerciciosPOO.Abstratas.exercicio2.dominio.Gato;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Cachorro cachorro = new Cachorro("Billy");
        Gato gato = new Gato("Mímí");

        animais.add(cachorro);
        animais.add(gato);

        for (Animal animal : animais) {
            if (animal.equals(cachorro) || animal.equals(gato)){
                animal.emitirSom();
            }
            System.out.println("Animal não encontrado");;
        }


    }
}
