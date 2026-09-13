import java.util.Scanner;

void main () {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Informe um número:");
	float numero = scanner.nextFloat();

	if (numero % 3 == 0 && numero % 5 != 0) {
		System.out.println("Múltiplo de 3.");
	}
	if (numero % 5 == 0 && numero % 3 != 0) {
		System.out.println("Múltiplo de 5.");
	}
	if (numero % 5 == 0 && numero % 3 == 0) {
		System.out.println("Múltiplo de ambos.");
	}
	if (numero % 5 != 0 && numero % 3 != 0) {
		System.out.println("Não é múltiplo de 3 nem de 5");
	}
}