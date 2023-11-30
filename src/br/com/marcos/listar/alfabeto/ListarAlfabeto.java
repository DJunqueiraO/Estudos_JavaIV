package br.com.marcos.listar.alfabeto;

public class ListarAlfabeto {

	public <T extends IListarAlfabeto> void listarAlfabeto(T t) {
		t.listarAlfabeto();
	}
	
}
