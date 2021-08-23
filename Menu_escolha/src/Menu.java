import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Menu de opções: 1- Idade 2- IMC 3- Sair");
		int escolha = sc.nextInt();
		
		
		while (escolha   >= 1 && escolha <= 3){
			int idade, anoAtual, anoDeNascimento;
			double peso, altura, imc;
			if (escolha == 1) {
				
				System.out.printf(" Ano de nascimento: ");
				anoDeNascimento = sc.nextInt();
				System.out.printf("Ano de atual: ");
				anoAtual = sc.nextInt();
				idade = (anoAtual - anoDeNascimento);
				System.out.printf("Sua idade é: ", idade);
			}
			else if (escolha == 2) {
				
				System.out.printf("Digite seu peso: ");
				peso = sc.nextDouble();
				System.out.printf("Digite sua altura: ");
				altura = sc.nextDouble();
				imc = peso / (altura * altura);
				System.out.printf("seu IMC é:", imc);
				
			}
			else if (escolha == 3) {
				System.out.printf("Saindo...Programa finalizado!");
				
			}
			else {
				System.out.printf("Valor inválido!");
			}
		}
		sc.close();
	}

}
