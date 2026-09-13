import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 1 e 30): ");
            int num = sc.nextInt();
            
            if (num >= 1 && num <= 30) {
                numeros[i] = num;
            } else {
                System.out.println("Número inválido! Digite um valor entre 1 e 30.");
                i--; // Decrementa o contador para repetir a leitura desta posição
            }
        }

        System.out.println("\nGráfico de Barras:");
        for (int num : numeros) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pula para a próxima linha após imprimir os asteriscos do número
        }

        sc.close();
    }
}
