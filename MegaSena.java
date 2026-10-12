package util;

import java.util.Scanner;
import java.util.TreeSet;

public class MegaSena {

    void main() {

        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numerosMega = new TreeSet<>();

        System.out.println("Digite 6 números de 1 a 60:");

        while(numerosMega.size() <6) {

            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero <= 60 && numero >= 1) {
                boolean inseriu = numerosMega.add(numero);

                if (!inseriu) {
                    System.out.println("Número repetido! Escolha outro.");
                }

            }
            else {
                System.out.println("Inválido! O número deve ser entre 1 e 60.");
            }
        }

        System.out.println("Números da Mega-Sena ordenados:");
        System.out.println(numerosMega);

    }

}
