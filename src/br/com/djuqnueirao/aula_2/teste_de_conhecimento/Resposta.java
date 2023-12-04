package br.com.djuqnueirao.aula_2.teste_de_conhecimento;

public enum Resposta {
	
	COMPILA_E_EXECUTA_COM_SUCESSO,
	COMPILA_E_FALHA_NA_EXECUÇÃO,
	FALHA_NA_COMPILAÇÃO,
	PUBLIC,
	PRIVATE,
	PACKAGE,
	DEFAULT,
	NULL
	;
	@Override
	public String toString() {
		switch (this) {
		
			case COMPILA_E_EXECUTA_COM_SUCESSO:
				return "Compila e executa com sucesso, apresentado a soma no console;";
				
			case COMPILA_E_FALHA_NA_EXECUÇÃO:
				return "Compila e falha na execução;";
				
			case FALHA_NA_COMPILAÇÃO:
				return "Falha na compilação;";

			default: 
				return name();
		}
	}
}
