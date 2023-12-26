import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora(input);
		calculadora.execute();

		input.close();
	}
}