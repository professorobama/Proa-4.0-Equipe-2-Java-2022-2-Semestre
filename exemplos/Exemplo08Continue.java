package equipe02;

public class Exemplo08Continue {

	public static void main(String[] args) {

		int numero = 0;

		while (numero < 10) {
			if (numero == 4) {
				numero++;
				continue;
			}
			System.out.println(numero);
			numero++;
		}

	}

}
