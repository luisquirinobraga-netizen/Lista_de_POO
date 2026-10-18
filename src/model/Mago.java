package model;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println("🔮 " + getNome() + " conjura uma bola de fogo! [Dano Mágico em Área]");
    }
}