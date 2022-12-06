package exercicio;

import java.util.Scanner;

public class Exercicio01 {

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Digite um número :");
	int numero=sc.nextInt();
	System.out.println("Digite um número :");
	int numero1=sc.nextInt();
	int soma=numero+numero1;
	System.out.println("O valor da soma é : "+soma);
	if (soma>18) {
		System.out.println("A soma é maior que 18");
	}
	
	sc.close();
}

}
