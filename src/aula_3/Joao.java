package aula_3;

public class Joao {

	public static void solution(final char start, final char end) {
		solution((int) start, (int) end);
	}
	
	public static void solution(final int start, final int end) {
		for (int i = start; i < end; i++) {
			System.out.println((char) i + (i == end - 1 ? "" : ", "));
		}
		System.out.println("");
	}
}
