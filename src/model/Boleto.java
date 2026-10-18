package model;

public class Boleto extends Pagamento{
    @Override
    public void processar(double valor) {
        System.out.println("[Boleto] Gerando boleto no valor de: R$ " + valor + " (Sem acréscimos ou descontos).");
    }
}
