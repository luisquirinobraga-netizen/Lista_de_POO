import java.util.Scanner;

void main () {
	float media;
	Scanner scanner = new Scanner(System.in);

	System.out.println("Informe o nome de um aluno:");
	String nome = scanner.nextLine();
	System.out.println("Informe a primeira nota (peso 1) deste aluno:");
	float nota_1 = scanner.nextFloat();
	System.out.println("Informe a segunda nota (peso 1) deste aluno:");
	float nota_2 = scanner.nextFloat();
	System.out.println("Informe a terceira nota (peso 2) deste aluno:");
	float nota_3 = scanner.nextFloat();

	media = (nota_1 + nota_2 + (nota_3 * 2)) / 4;

	if (media >= 7) {
		System.out.println("O aluno está aprovado.");
	}
	if (media < 7) {
		System.out.println("O aluno está reprovado.");
	}
}