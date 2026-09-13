import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 1 e 30): ");
            int num = sc.nextInt();
            if (num >= 1 && num <= 30) {
                numeros[i] = num;
            } else {
                System.out.println("Número inválido! Tente novamente.");
                i--;
            }
        }

        System.out.println("\nGráfico de Barras:");
        for (int num : numeros) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}