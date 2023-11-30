package br.com.djuqnueirao.aula_3;

public class My {
	
	public static void solution(final int numberofColumns) {
		solution(65, 122, numberofColumns);
	}
	
	public static void solution() {
		solution(65, 122, 5);
	}
	
	public static void solution(
			final char initialChar,
			final int finalCode,
			final int numberofColumns
	) {
		solution((int) initialChar, finalCode, numberofColumns);
	}
	
	public static void solution(
			final int initialCode,
			final int finalCode,
			final int numberofColumns
	) {
		for (
				int i = initialCode, column = 1; 
				i <= finalCode; 
				i++
		) {
			if(i > 90 && i < 97) continue;
			System.out.print((char) i);
			if(i == finalCode) continue;
			System.out.print("\t");
			if(column % numberofColumns == 0) {
				System.out.println();
			}
			column++;
		}
	}
}
