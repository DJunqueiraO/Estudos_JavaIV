public class OperadorTernario {
	public static void main(String... args) {
		boolean bool = true;
		
		int numero = (bool) ? 4 : 5;
		System.out.println(numero);

		bool = false;
		int numero2 = (bool)? 4 : (bool) ? 5 : 10;
		System.out.println(numero2);

		bool = false;
		int numero3 = (bool)? 4 : (!(bool = true)) ? 5 : (numero2 == 5)? 25 : 0;
		System.out.println(numero3);
	}

	private static void teste_1() {
		int a = 'a';
		int b = 'b';

		int maior = a > b? a : b;

		System.out.println((char) maior);
	}
}
