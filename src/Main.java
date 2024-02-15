import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Váriaveis
		String nome;
		int idade;
		double salario;
		char letra_nome;
		String frase;

		//Nome
		System.out.println("Digite seu nome completo: ");
		nome = scanner.nextLine();
		//Idade
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		//Salário
		System.out.println("Digite seu Sálario: ");
		salario = scanner.nextDouble();
		//Primeira Letra do Nome
		System.out.println("Digite a primeira letra do seu Nome: ");
		letra_nome = scanner.next().charAt(0); // Corrija para charAt(0)
		scanner.nextLine();
		//Frase Completa
		System.out.println("Digite uma frase completa: ");
		frase = scanner.nextLine();

		//Resultados
		System.out.println("Nome : " + nome);
		System.out.println("Idade : " + idade);
		System.out.printf("Salário : R$%.2f%n", +salario);
		System.out.println("Primeira Letra do nome : " + letra_nome);
		System.out.println("Frase Completa : " + frase);

		scanner.close();
	}
}