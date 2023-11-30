package br.com.djuqnueirao.aula_3;

public class LiteralNumericaTipoInteiro {
	
	public static void main(String[] args) {
		
		final byte b = 10;
		print(b);
		print((byte) 10);
	}
	
	private static void print(final byte b) {
		System.out.println(b);
	}
}
