package equipe02;

public class ExemploVariavel {
	
	 static String login = "jailson.santos"; // variável estática
	 
	 
	static void soma() {
		int a= 10; //variável local
		int b=20;
		int somatorio=a+b;
		System.out.println(somatorio);
	}
	
	
	public static void main(String[] args) {
		
		int data = 50; // variável de instância
		System.out.println(data);
		System.out.println(login);
		soma();
		
	}

}
