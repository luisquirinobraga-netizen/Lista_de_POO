import java.util.Scanner;

void main () {
    int[] numeros = new int[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Digite o " + (i + 1) + "º número (entre 1 e 30):");
        int num = scanner.nextInt();
        
        if (num >= 1 && num <= 30) {
            numeros[i] = num;
        }
        if (num < 1 || num > 30) {
            System.out.println("Número inválido! Digite um valor entre 1 e 30.");
            i--;
        }
    }

    System.out.println("Gráfico de Barras:");
    for (int num : numeros) {
        for (int j = 0; j < num; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
