package br.com.djuqnueirao.aula_2._2;

public class Desafio {
	
	public static void main(String[] args) {
		My.solution('\u0061', 122, 10);
		System.out.println();
		System.out.println();
		My.solution(10);
		System.out.println();
		System.out.println();
		solution();
		System.out.println();
		System.out.println();
		Joao.solution('a', 'z');
		System.out.println();
		System.out.println();
		Joao.solution(97, 122);
	}
	
    public static void solution() {
        char literal_unicode = '\u0061';
        for ( int i = 0; i < 26; i++ ){
            if(i == 25){
                System.out.print(literal_unicode);
            } else {
                System.out.print(literal_unicode + ",");
            }
            literal_unicode++;
        }
    }
}
