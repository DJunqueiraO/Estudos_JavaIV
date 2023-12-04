package br.com.djuqnueirao.aula_2.teste_de_conhecimento;

public enum Resposta {
	
	COMPILA_E_EXECUTA_COM_SUCESSO,
	COMPILA_E_FALHA_NA_EXECU��O,
	FALHA_NA_COMPILA��O,
	PUBLIC,
	PRIVATE,
	PACKAGE,
	DEFAULT,
	NULL
	;
	@Override
	public String toString() {
		final String resposta = "\nResposta: ";
		switch (this) {
			case COMPILA_E_EXECUTA_COM_SUCESSO:
				return resposta + "Compila e executa com sucesso, apresentado a soma no console;";
				
			case COMPILA_E_FALHA_NA_EXECU��O:
				return resposta + "Compila e falha na execu��o;";
				
			case FALHA_NA_COMPILA��O:
				return resposta + "Falha na compila��o;";

			default: 
				return resposta + name();
		}
	}
}
