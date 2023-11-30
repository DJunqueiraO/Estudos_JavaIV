package br.com.marcos.listar.alfabeto;

@FunctionalInterface
public interface IListarAlfabeto {

	public static final int LIMITE = 26;
	
	char getLiteralChar();
	
	default void listarAlfabeto() {
		System.out.println("Imprimindo alfabeto em " + this.getClass().getSimpleName());
		for(int i = 0; i < LIMITE; i++){
			System.out.print((char)(getLiteralChar() + i));
			if(i != LIMITE - 1 )
				System.out.print(" , ");
		}
		System.out.println("\nFinalizando a impressão do alfabeto " + this.getClass().getSimpleName());
		System.out.println("--------------------------------------------------------");
	}
}
