package Chamada;

public class Main {

    public static void main(String[] args) {
        Chamada chamada = new Chamada("Programação Orientada a Objeto", "Adam Smith");

        chamada.chamada();

        chamada.setNomeProfessor("Setted: Adam Smith");
        chamada.chamada();
    }
}
