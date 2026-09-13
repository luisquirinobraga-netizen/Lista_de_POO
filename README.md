# Lista de Exercícios 01 - POO

## Q5

### Como o Scanner é utilizado para entrada de dados em Java?

O Scanner é utilizado para receber dados digitados pelo usuário durante a execução do programa. Para utilizar o Scanner, primeiro precisamos importar a classe: "import java.util.Scanner;". Depois, criamos um objeto Scanner: "Scanner scanner = new Scanner(System.in);". Para usar esse scanner, para ler diferentes tipos, deve-se especificar o seu tipo e, caso necessário, limpar o buffer por meio de um scan "preventivo". Ex.:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();

        System.out.println("Você digitou: " + numero);

        scanner.close();
    }
}

### Como o System.out.printf pode ser útil?

O "System.out.printf" permite formatar a saída do programa. Por exemplo, podemos utilizar "%.2f" para exibir um número do tipo "double" com duas casas decimais. Exemplo: "double numero = 10.5;"; "System.out.printf("Número: %.2f%n", numero);". A saída será: "Número: 10.50". Ex.:

public class Main {
    public static void main(String[] args) {

        double numero = 10.56789;

        System.out.printf("Número: %.2f%n", numero);
    }
}

## Q6

### Erros Identificados no Código:
- Assinatura do main incorreta: String args deveria ser um array String[] args ou String... args.
- Falta de incremento no while: A variável contador nunca é incrementada, o que geraria um loop infinito se a condição fosse atendida.
- Escopo do bloco while vazio: As chaves do while estavam vazias e o bloco de impressão (System.out.println) estava posicionado incorretamente fora do escopo ou com erro de sintaxe.
- Falta de ponto e vírgula: A linha final do System.out.println estava sem o ponto e vírgula ;.

### Código Corrigido:

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // Incremento para evitar loop infinito
        }
        
        sc.close();
    }
}
