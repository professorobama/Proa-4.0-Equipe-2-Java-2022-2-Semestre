package exercicio;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor :");
		int valor = sc.nextInt();
		if (valor>10) {
			System.out.println("O número digitado é maior que 10 !");
		} else {
			System.out.println("O número digitado é menor que 10 !");
		}
sc.close();
	}

}
