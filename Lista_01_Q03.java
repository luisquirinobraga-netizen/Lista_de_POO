import java.util.Scanner;

void main () {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Informe um número inteiro positivo \"N\":");
	int numero = scanner.nextInt();
	System.out.print("No intervalo entre 2 e \"N\" residem os seguintes números primos:");

	for (int contador = 2 ; contador <= numero ; contador++) {

		int divisores = 0;

		for (int pendulo = 1 ; pendulo <= contador ; pendulo++) {
			if (contador % pendulo == 0) {
				divisores = divisores + 1;
			}
		}

		if (divisores <= 2) {
			System.out.print(" " + contador);
		}
	}
}