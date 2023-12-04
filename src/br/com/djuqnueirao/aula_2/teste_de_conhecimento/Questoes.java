package br.com.djuqnueirao.aula_2.teste_de_conhecimento;

public enum Questoes {
	_1,
	QUAL_O_RESULTADO_DO_C�DIGO_ABAIXO,
	_7,
	_8,
	_9,
	_10,
	_11
	;
	@Override
	public String toString() {
		switch (this) {
		
			case _1:
				return "Qual a sintaxe do Java para representar literais num�ricos inteiros de base 8?\nIniciar o n�mero com um zero, seguido pelos d�gitos octais, que v�o de 0 a 7.";
				
			case QUAL_O_RESULTADO_DO_C�DIGO_ABAIXO:
				return "Qual o resultado do c�digo abaixo?";
				
			case _7:
				return "Qual o escopo mais longo do Java?";
				
			case _8:
				return "Quais as 5 formas de se criar um char e atribuir a ele um caractere presente na tabela ASCII?";
				
			case _9:
				return "Qual o padr�o adotado pelo Java (tipo literal) para representar n�meros inteiros e de ponto flutuante? ";
				
			case _10:
				return "Qual o valor padr�o utilizado pelo Java para inicializar um objeto?";
				
			case _11:
				return "Criar um programa em que dado o seguinte array:"
						+ "\nfinal int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};\n"
						+ "Apresentar a seguinte sa�da:\r\n" + 
						"2,4,6,8,10,12,14,16,18,20,1,3,5,7,9,11,13,15,17,19,\r\n";

			default: 
				return name();
		}
	}
}
