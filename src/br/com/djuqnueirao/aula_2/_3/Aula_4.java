package br.com.djuqnueirao.aula_2._3;

public class Aula_4 {
	
	public static void main(String[] args) {
		
		deMalAPior();
	}

	public static void testeUpgrade(String arg) {
		try {
			byte _byte = Byte.valueOf(arg);
			short _short = _byte;
			char _char = (char) _short;
			int _int = _char;
			long _long = _int;
			float _float = _long;
			double _double = _float;

			System.out.println(_double);
		} catch(Exception e) {
			System.out.println(
				e.getClass().getSimpleName() + 
				": " + 
				e.getMessage()
			);
		}
	}

	public static void testeDowngrade(String arg) {
		try {
			double _double = Double.valueOf(arg);
			System.out.println(_double);

			float _float = (float) _double;
			System.out.println(_float);

			long _long = (long) _float;
			System.out.println(_long);

			int _int = (int) _long;
			System.out.println(_int);

			char _char = (char) _int;
			System.out.println(_char);

			short _short = (short) _char;
			System.out.println(_short);

			byte _byte = (byte) _short;
			System.out.println(_byte);

			long longo = 9223372036854775607l;
			System.out.println(longo);

		} catch(Exception e) {
			System.out.println(
				e.getClass().getSimpleName() + 
				": " + 
				e.getMessage()
			);
		}
	}

	public static void deMalAPior() {

		char _char = (char) -100;
		byte _byte = 'b';
		short _short = '-';

		System.out.printf(
			"char: %c\nbyte: %d\nshort: %d", 
			_char, _byte, _short
		);
	}
}
