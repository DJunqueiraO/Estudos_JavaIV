package aula_3;

public class Desafio {
	
	public static void main(String[] args) {
		My.solution('\u0061', 122, 5);
		System.out.println();
		System.out.println();
		My.solution();
		System.out.println();
		System.out.println();
		solution();
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
