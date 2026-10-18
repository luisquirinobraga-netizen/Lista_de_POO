package model;

public class CartaoCredito extends Pagamento{
    @Override
    public void processar(double valor) {
        double taxa = valor * 0.03;
        double total = valor + taxa;
        System.out.println("[Cartão de Crédito] Valor original: R$ " + valor + " | Taxa (3%): R$ " + taxa + " | Total processado: R$ " + total);
    }
}
