package br.com.djuqnueirao.aula_2._2;

public class Aula_3 {
	
	public static void main(String[] args) {
		
		final char character = 'a';
		final char character_dec = 97;
		final char character_oct = 0141;
		final char character_hex = 0x61;
		final char character_unicode = '\u0061';
		
		System.out.printf(
				"%s, %s, %s, %s, %s",
				character, character_dec, character_oct, character_hex, character_unicode
		);
	}
}
