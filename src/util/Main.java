import model.Pagamento;
import model.Pix;
import model.CartaoCredito;
import model.Boleto;

void main() {
    double valor = 150.0;
    Pagamento[] pagamentos = new Pagamento[3];
    pagamentos[0] = new CartaoCredito();
    pagamentos[1] = new Pix();
    pagamentos[2] = new Boleto();

    for (Pagamento pagamento : pagamentos) {
        pagamento.processar(valor);
    }
}