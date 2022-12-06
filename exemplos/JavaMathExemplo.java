package equipe02;

public class JavaMathExemplo {

	public static void main(String[] args) {
		
		/*int numero = 10;
		int numero1 = 4;
		System.out.println(Math.max(numero, numero1));
		System.out.println(Math.min(numero, numero1));
		System.out.println(Math.sqrt(144));
		System.out.println(Math.abs(-25.4));
		System.out.println(Math.random());*/
		
		//-----------------------------------------------------//
		int contadora=0;
		int qtdDeVezes=0;
		
		while (contadora<=100){
			int numeroAleatorio=(int)(Math.random()*101);
			
			if( (numeroAleatorio>=50) && (numeroAleatorio<=100)) {
				System.out.println(numeroAleatorio);
				qtdDeVezes++;
			} else {

			}		
			contadora++;			
		};
		System.out.println("A quantidade de vezes que o programa foi maior que 50: "+qtdDeVezes);

	}

}
