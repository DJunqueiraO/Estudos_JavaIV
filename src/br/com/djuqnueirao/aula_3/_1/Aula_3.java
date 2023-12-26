package br.com.djuqnueirao.aula_3._1;

public class Aula_3 {
	public static void main(String ...s) {
		Integer x = 0;
		Integer y = 0;

		for(Short z = 0; z < 5; z++)
			
			if((++x > 2) || (++y > 2)) 
				x++;

		System.out.println(x++ + " " + ++y);
	}
}
