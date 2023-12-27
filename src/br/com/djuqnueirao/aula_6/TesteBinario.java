package br.com.djuqnueirao.aula_6;

public class TesteBinario {

	public static void main(String[] args) {
		
//		int a = 15;
//		int b = 16;

//		testOperadores(a, b);
//		testOperadoresDeslocamento(a, b);
//		testOperadoresDeslocamento(16, 1);
//		testOperadoresDeslocamento(-16, 1);
		testOperadoresDeslocamento(2, 1);
	}
	
	private static void testOperadoresDeslocamento(final int a, final int b) {
		System.out.printf(
				"%s >> %s = %s(%d)\n", 
				Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a >> b), a >> b
		);
		System.out.printf(
				"%s << %s = %s(%d)\n",
				Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a << b), a << b
		);
		System.out.printf(
				"%s >>> %s = %s(%d)\n", 
				Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a >>> b), a >>> b
		);
	}
	
	private static void testOperadores(final int a, final int b) {
		System.out.printf(
				"%s & %s = %s(%d)\n", 
				Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a & b), a & b
		);
		System.out.printf(
				"%s | %s = %s(%d)\n", 
				Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a | b), a | b
		);
		System.out.printf(
				"%s ^ %s = %s(%d)\n", 
				Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(a ^ b), a ^ b
		);
	}
}
