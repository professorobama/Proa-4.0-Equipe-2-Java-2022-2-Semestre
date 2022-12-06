package equipe02;

public class Exemplo07String {

	public static void main(String[] args) {
		
		String nome= "Jailson";
		String frase = "Adoro Step by Step";
		
		System.out.println(nome);
		
		System.out.println("A quantidade de caracteres corresponde a : "+nome.length());
		
		System.out.println("Metódo To Upper Case :" +nome.toUpperCase());

		System.out.println("Metódo To Lower Case :" +nome.toLowerCase());
		
	
		
		System.out.println("Localização de palavra :"+ frase.indexOf("Step"));
		
		System.out.println(nome +" "+ frase);
		System.out.printf("%s %s\n\n",nome , frase);
		System.out.println(nome.concat(frase));
		
		int numero1= 10;
		int numero2 = 20;
		int soma =numero1+numero2;
		
		System.out.println(soma);
		
		
		String numero3= "10";
		String numero4 = "20";
		String soma1 =numero3+numero4;
System.out.println(soma1);

System.out.println(numero4+numero2);
String txt = "We are the so-called \"Vikings\" from the north.";

System.out.println(txt);

String txt2 = "It\'s alright.";
System.out.println(txt2);
	}

}
