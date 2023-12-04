package br.com.djuqnueirao.aula_2.teste_de_conhecimento;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class TesteDeConhecimento {

	public static void main(String[] args) {
		line();
		questao1();
		line();
		questao2();
		line();
		questao3();
		line();
		questao4();
		line();
		questao5();
		line();
		questao6();
		line();
		questao7();
		line();
		questao8();
		line();
		questao9();
		line();
		questao10();
		line();
		questao11();
		line();
	}
	
	private static void line() {
		System.out.print("\n*");
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.print("*\n");
	}
	
//	1.	Qual a sintaxe do Java para representar literais numéricos inteiros de base 8?.
//			Iniciar o número com um zero, seguido pelos dígitos octais, que vão de 0 a 7.
	private static void questao1() {
		System.out.println(Questao._1);
		int numeroOctal = 075;
		System.out.println(numeroOctal);
	}
	
//			2.	Qual o resultado do código abaixo? 
	
//			(X) Compila e executa com sucesso, apresentado a soma no console;
//			() Compila e falha na execução;
//			() Falha na compilação;
	private static void questao2() {
			System.out.println("2. " + Questao.QUAL_O_RESULTADO_DO_CÓDIGO_ABAIXO);
			short s = 100;
			System.out.println(++s);
			System.out.println(Resposta.COMPILA_E_EXECUTA_COM_SUCESSO);
	}

//	3.	Qual o resultado do código abaixo?
//
//	(X) Compila e executa com sucesso, apresentado a soma no console;
//	() Compila e falha na execução;
//	() Falha na compilação;
	private static void questao3() {
			System.out.println("3. " + Questao.QUAL_O_RESULTADO_DO_CÓDIGO_ABAIXO);
			byte b = 100 + 1;
			System.out.println(b);
			System.out.println(Resposta.COMPILA_E_EXECUTA_COM_SUCESSO);
	}
	
//			4.	Qual o resultado do código abaixo?
//
//			() Compila e executa com sucesso, apresentado a soma no console;
//			() Compila e falha na execução;
//			(X) Falha na compilação;
	private static void questao4() {
			System.out.println("4. " + Questao.QUAL_O_RESULTADO_DO_CÓDIGO_ABAIXO);
//			byte b = 100 + 1;
//			byte c = 100;
//			byte d = 1;
//			byte e = c + d;
//			System.out.println(e);
//			System.out.println("Resposta da questão 4:");
//			System.out.println(Resposta.COMPILA_E_EXECUTA_COM_SUCESSO);
			System.out.println(Resposta.FALHA_NA_COMPILAÇÃO);
	}
	
//			5.	Qual o resultado do código abaixo?
//
//			(X) Compila e executa com sucesso, apresentado a soma no console;
//			() Compila e falha na execução;
//			() Falha na compilação;
	private static void questao5() {
			System.out.println("5. " + Questao.QUAL_O_RESULTADO_DO_CÓDIGO_ABAIXO);
			byte b = 010 + 8;
			System.out.println(b);
			System.out.println(Resposta.COMPILA_E_EXECUTA_COM_SUCESSO);
	}
	
//			6.	Qual o resultado do código abaixo?
//
//			() Compila e executa com sucesso, apresentado a soma no console;
//			() Compila e falha na execução;
//			(X) Falha na compilação;
	private static void questao6() {
			System.out.println("6. " + Questao.QUAL_O_RESULTADO_DO_CÓDIGO_ABAIXO);
			byte b = 010 + 8;
			System.out.println(b);
			System.out.println(Resposta.COMPILA_E_EXECUTA_COM_SUCESSO);
	}
	
//			7.	Qual o escopo mais longo do Java? 
//			O escopo de classe.
	private static void questao7() {
			System.out.println(Questao._7);
			System.out.println(Resposta.PUBLIC);
	}
	
//			8.	Quais as 5 formas de se criar um char e atribuir a ele um caractere presente na tabela ASCII?
//			Atribuição direta com caractere literal, Atribuição usando valor decimal, Atribuição usando valor hexadecimal, Atribuição usando valor octal, Atribuição usando Unicode.
	private static void questao8() {
			System.out.println(Questao._8);
//			char[] formas = new char[] {
//					'A',
//					65,
//					'\u0041',
//					0x41,
//					0041
//			};
			String[] formas = new String[] {
					"A",
					"65",
					"\\u0041",
					"0x41",
					"0041"
			};
			for (String forma : formas) {
				System.out.print("\nchar myChar = " + forma);
			}
	}
	
//			9.	Qual o padrão adotado pelo Java (tipo literal) para representar números inteiros e de ponto flutuante? 
//			Int e double.
	private static void questao9() {
		System.out.println(Questao._9);
		System.out.println("O próprio número(que é interpretado como Int) e o número com ponto(que é interpretado por padrão como double).");
	}

//			10.	Qual o valor padrão utilizado pelo Java para inicializar um objeto?
	private static void questao10() {
		System.out.println(Questao._10);
		System.out.println(Resposta.NULL);
	}
	
//			11.	Criar um programa em que dado o seguinte array: (10 pontos)
//			Apresentar a seguinte saída:
//			2,4,6,8,10,12,14,16,18,20,1,3,5,7,9,11,13,15,17,19,

	private static void questao11() {
		System.out.println(Questao._11);
		final int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		final IntPredicate toPair = number -> (number % 2) == 0;
		final Stream<Integer> arrayOfPairNumbers = (
				Arrays
					.stream(array)
					.filter(toPair)
					.mapToObj(Integer::valueOf)
		);
		final IntPredicate toOdd = number -> (number % 2) != 0;
		final Stream<Integer> arrayOfOddNumbers = (
				Arrays
					.stream(array)
					.filter(toOdd)
					.mapToObj(Integer::valueOf)
		);
		final Object[] newArray = Stream.concat(arrayOfPairNumbers, arrayOfOddNumbers).toArray();
		System.out.println(
				String
					.valueOf(Arrays.asList(newArray))
					.replace("[", "")
					.replace("]", "")
		);
	}
}
