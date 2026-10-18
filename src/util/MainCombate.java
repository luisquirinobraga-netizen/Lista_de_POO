import model.Personagem;
import model.Guerreiro;
import model.Mago;
import model.Arqueiro;

void main() {
    Personagem[] grupo = {
            new Guerreiro("Thorin"),
            new Mago("Gandalf"),
            new Arqueiro("Legolas")
    };

    for (Personagem personagem : grupo){
        personagem.atacar();
    }
}