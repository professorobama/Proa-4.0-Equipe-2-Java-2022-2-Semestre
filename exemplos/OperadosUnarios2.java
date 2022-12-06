package equipe02;

public class OperadosUnarios2 {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		System.out.println(a++ + ++a); // => 20 + 21+1 => 20 + 22 => 42
		System.out.println(b++ + b++); // => 30 + 31+1 => 32
		System.out.println(b);
		System.out.println(++b + b++ + ++b);// =>33 + 33 + 34+1 
		System.out.println(a++ + b++ + ++a + ++b);
		

		

	}

}
