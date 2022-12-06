package equipe02;

public class ExemploMatriz {

	public static void main(String[] args) {
		int [] [] numero= {{1,2,3},{4,5,6}};
		
		System.out.println(numero [0][2]);
		System.out.println(numero [1][1]);
		System.out.println(numero [1][2]);
		
		numero[0][0]=7;
		
		System.out.println(numero[0][0]);
	}

}
