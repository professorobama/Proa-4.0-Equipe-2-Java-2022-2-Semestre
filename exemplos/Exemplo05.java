package equipe02;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade :");
		int idade = sc.nextInt();

		if(idade<16) {
			System.out.println("Não pode votar");
		}else if(idade<18) {
			System.out.println("Não é obrigado a votar");
		}else {
			System.out.println("Voto obrigatório");
		}
		sc.close();
	}

}