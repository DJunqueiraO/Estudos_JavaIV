package br.com.djuqnueirao.aula_6;

public class OperadorDeslocamento {
	
	public static void main(String... s){
		
		{
			int numero = 16;
			System.out.println(numero >> 1); 	  	// DIVISÃO 			(NAO DESLOCA O BIT DE SINAL)
			System.out.println(numero << 1); 	  	// MULTIPLICAÇÃO 	(NAO DESLOCA O BIT DE SINAL)
			System.out.println(numero >>> 1); 	// DIVISÃO 			(DESLOCA O BIT DE SINAL)
		}
		
		{
			int numero = -16;
			System.out.println(numero >> 1);	 	// DIVISÃO 			(NAO DESLOCA O BIT DE SINAL)
			System.out.println(numero << 1);    	// MULTIPLICAÇÃO 	(NAO DESLOCA O BIT DE SINAL)
			System.out.println(numero >>> 1);   	// DIVISÃO 			(DESLOCA O BIT DE SINAL)		
		}
	}
}