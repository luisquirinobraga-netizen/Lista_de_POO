package model;

import java.util.Scanner;

public class Fibonacci {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor n:");
        int n = scanner.nextInt();
        System.out.println("Sequência de Fibonacci correspondente ao valor de n:");
        if (n >= 0) {
            System.out.println("0");
        }
        if (n >= 1) {
            System.out.println("1");
        }
        if (n >= 2) {
            int valor = 0, valor_2 = 1, resultado;
            for (int x = 2; x <= n; x++){
                resultado = valor + valor_2;
                System.out.println(resultado);
                valor = valor_2;
                valor_2 = resultado;
            }
        }
    }
}