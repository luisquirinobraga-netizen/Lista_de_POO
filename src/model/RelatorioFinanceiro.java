package model;

public class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {

    @Override
    public void imprimir() {
        System.out.println("🖨️ Imprimindo Relatório Financeiro.");
    }

    @Override
    public void enviar(String email) {
        System.out.println("📧 Enviando Relatório Financeiro para: " + email);
    }
}