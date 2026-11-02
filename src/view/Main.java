import model.*;

void main() {
    Smartphone smartphone = new Smartphone();

    // Testando a implementação de "AparelhoTelefonico"
    smartphone.ligar("+55 83 99180-2140");
    smartphone.atender();
    // Testando a implementação de "NavegadorInternet"
    smartphone.exibirPagina("https://youtu.be/dQw4w9WgXcQ?si=KxdYEqiPubrajq9j");
    smartphone.adicionarNovaAba();
    // Testando a implementação de "ReprodutorMusical"
    smartphone.tocar();
    smartphone.pausar();

    // Testando a implementação de "OperacaoMatematica" usando Lambda
    OperacaoMatematica soma = (a,b) -> a+b;
    OperacaoMatematica subtracao = (a,b) -> a-b;
    OperacaoMatematica multiplicacao = (a,b) -> a*b;
    OperacaoMatematica divisao = (a,b) -> {
        if(b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a/b;
    };

    // Testando a implementação de "RelatorioFinanceiro" e "Contrato" usando instanceof
    Object[] documentos = {
            new RelatorioFinanceiro(),
            new Contrato()
    };

    for (Object doc : documentos) {
        if (doc instanceof Imprimivel) {
            ((Imprimivel) doc).imprimir();
        }
        if (doc instanceof EnviavelPorEmail) {
            ((EnviavelPorEmail) doc).enviar("diretoria@ifpb.edu.br");
        }
    }
}
