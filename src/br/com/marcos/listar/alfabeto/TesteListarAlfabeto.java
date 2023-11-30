package br.com.marcos.listar.alfabeto;

public final class TesteListarAlfabeto {

	public static void main(String[] args) {
		
		ListarAlfabeto listar = new ListarAlfabeto();
		
		listar.listarAlfabeto(new ListarUnicode());
		listar.listarAlfabeto(new ListarDecimal());
		listar.listarAlfabeto(new ListarHexadecimal());
		listar.listarAlfabeto(new ListarOctal());
	}

}
