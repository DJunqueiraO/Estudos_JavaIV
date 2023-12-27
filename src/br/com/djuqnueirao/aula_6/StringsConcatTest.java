import java.util.ArrayList;
import java.util.List;

public class StringsConcatTest {

	public static void main(String... args) {
		test4();
	}

	private static void test1() {
		final String primeiroNome = "Julio";
		final String segundoNome = "Cezar";
		System.out.println(primeiroNome + " " + segundoNome + " Goleiro");
	}

	private static void test2() {
		int a = 1;
		int b = 5;
		System.out.println(a + b);
		System.out.println("" + a + b);
		System.out.println(a + "" + b);
		System.out.println(a + b + "");
		System.out.println(a + b + "a");
	}

	private static void test3() {
		final String primeiroNome = "Julio";
		final String segundoNome = "Cezar";
		System.out.println(
			String.join(
				" " , primeiroNome , segundoNome, "Goleiro"
			)
		);
		List<String> list = new ArrayList<>();
		list.add("Imersao");
		list.add("Java");
		list.add("Foursys");
		System.out.println(String.join(" ", list));
	}

	private static void test4() {

		String imersao = "Imersao";
		System.out.println(imersao + " JAVA" + " Foursys"); // Imersao JAVA Foursys

		String strNumerol = "1";
		System.out.println(2 + strNumerol + 3); // 213

		int numerol = 1;
		System.out.println(2 + numerol + 3); // 6

		int numero2 = 2;
		System.out.println(strNumerol + (numerol + numero2)); // 13

		int numero3 = 3;
		System.out.println((numerol + strNumerol + numero2 + numero3 )); // 1123
	}
}
