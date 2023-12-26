public class MenuPrinter {

	public void greet() {
		System.out.println("\nBem vindo ao sistema calculadora, para calcular sera necesssario inserir dois valores, \"a\" e \"b\"");
	}

	public void askValueOf(String variableName) {
		System.out.print("Digite o valor de \"" + variableName + "\": ");
	}

	public void askOperation() {
		System.out.println("Digite a operacao:");
		System.out.println("+ para soma");
		System.out.println("- para subtracao");
		System.out.println("/ para divisao");
		System.out.println("* para multiplicacao");
	}

	private void sayInvalidZeroDivision() {
		System.out.println("A operacao de divisao por zero e invalida.");
	}

	public void sayNoOperator() {
		System.out.println("O operador informado nao existe.");
	}

	public void sayInvalidNumber() {
		System.out.println("O valor informado nao e numero.");
	}

	public void askIfContinue() {
		System.out.println("Deseja efetuar mais alguma operacao?");
		System.out.println("N para nao.");
		System.out.println("S para sim.");
	}

	public void sayResult(
		final double a,
		final String operation,
		final double b,
		final double result
	) {
		if(result == Double.POSITIVE_INFINITY) {
			sayInvalidZeroDivision();
			return;
		}
		System.out.println(
			String.format(
				"o resultado da operacao %.2f %s %.2f e %.2f",
				a, operation, b, result
			)
		);
	}
}