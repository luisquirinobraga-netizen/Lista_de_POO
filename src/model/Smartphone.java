package model;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("📞 Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("📞 Chamada atendida. Alô?");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("🌐 Nova aba adicionada ao navegador.");
    }

    @Override
    public void tocar() {
        System.out.println("🎵 Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸️ Música pausada.");
    }

}