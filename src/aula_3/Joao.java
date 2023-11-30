package aula_3;

public class Joao {

	public static void solution(final char start, final char end) {
		solution((int) start, (int) end);
	}
	
	public static void solution(final int start, final int end) {
		for (int i = start; i <= end; i++) {
			System.out.print((char) i + (i == end ? "" : ", "));
		}
		System.out.println("");
	}
}
