package model;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("⚔️ " + getNome() + " ataca com sua espada pesada! [Dano Físico Pesado]");
    }
}