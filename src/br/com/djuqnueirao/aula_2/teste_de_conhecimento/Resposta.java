package br.com.djuqnueirao.aula_2.teste_de_conhecimento;

public enum Resposta {
	
	COMPILA_E_EXECUTA_COM_SUCESSO,
	COMPILA_E_FALHA_NA_EXECUCAO,
	FALHA_NA_COMPILACAO,
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
				
			case COMPILA_E_FALHA_NA_EXECUCAO:
				return resposta + "Compila e falha na execu��o;";
				
			case FALHA_NA_COMPILACAO:
				return resposta + "Falha na compila��o;";

			default: 
				return resposta + name();
		}
	}
}
