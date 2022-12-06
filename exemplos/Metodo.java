package equipe02;

import java.util.Scanner;

public class Metodo {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Boungiorno");
		System.out.println("Digite seu nome :");
		String nome = sc.next();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu Email :");
		String email = sc.next();
		
		System.out.println("Digite sua rua :");
		String rua = sc.next();
		
		System.out.println("Digite seu CEP :");
		String cep = sc.nextLine();
		
		System.out.println("Digite seu numero de celular :");
		int numerocell = sc.nextInt();
		
		System.out.println("Digite seu numero fixo :");
		int numerofixo = sc.nextInt();
		
		cadastro(nome, idade, email, rua, cep, numerocell, numerofixo);
		
		sc.close();
	}
	
	static void cadastro(String nome, int idade, String email, String rua, String cep, int numerocell, int numerofixo) {
		System.out.println("Seu nome  é : " +nome);
		System.out.println("Sua idade  é : " +idade);
		System.out.println("Seu Email  é : " +email);
		System.out.println("Sua rua é : " +rua);
		System.out.println("Seu CEP  é : " +cep);
		System.out.println("Seu número de celular  é : " +numerocell);
		System.out.println("Seu número fixo é : " +numerofixo);
	}
}
