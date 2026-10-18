package model;

public class Pix extends Pagamento{
    @Override
    public void processar(double valor) {
        double desconto = valor * 0.05;
        double total = valor - desconto;
        System.out.println("[Pix] Valor original: R$ " + valor + " | Desconto (5%): R$ " + desconto + " | Total pago: R$ " + total);
    }
}
