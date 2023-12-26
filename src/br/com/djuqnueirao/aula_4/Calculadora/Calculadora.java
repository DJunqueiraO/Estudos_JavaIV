import java.util.Scanner;

public class Calculadora {

	final Scanner input;

	public Calculadora(final Scanner input) {
		this.input = input;
	} 

	void execute() {
		MenuPrinter menu = new MenuPrinter();
		while(true) {
			double a, b;
			menu.greet();
			menu.askValueOf("a");
			try {
				a = Double.parseDouble(input.next());
			} catch(Exception e) {
				menu.sayInvalidNumber();
				continue;
			}
			menu.askValueOf("b");
			try {
				b = Double.parseDouble(input.next());
			} catch(Exception e) {
				menu.sayInvalidNumber();
				continue;
			}
			menu.askOperation();
			Operation operacao = Operation.getInstance(input.next());
			if(operacao == null) {
				menu.sayNoOperator();
				continue;
			} else {
				final double result = operacao.calculate(a, b);
				menu.sayResult(a, operacao.toString(), b, result);
			}
			menu.askIfContinue();
			String resposta = input.next();
			if(resposta.equalsIgnoreCase("N")) {
				break;
			}
		}
	}
}