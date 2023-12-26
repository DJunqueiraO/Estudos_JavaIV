package br.com.djuqnueirao.aula_3._2;

public class Teste {

	private final int num;

	public Teste(final int num) {
		this.num = num;
	}

	public int getNum() {
		return this.num;
	}

	public static void main(String... s) {
		Teste teste = new Teste(1);
	}
}
