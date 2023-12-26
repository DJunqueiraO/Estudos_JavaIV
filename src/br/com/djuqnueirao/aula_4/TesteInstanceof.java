import java.io.Serializable;

public class TesteInstanceof {

	public static void main(String... args) {
		
		String nome = "Corote";

		//if(nome instanceof Integer) {
		//	System.out.println("is number");
		//}

		teste(nome);

		if(nome instanceof Object) {
			System.out.println("e objeto");
		}	

		if(nome instanceof Serializable) {
			System.out.println(
				"e " + Serializable.class.getSimpleName()
			);
		}	

		if(nome instanceof Comparable) {
			System.out.println(
				"e " + Comparable.class.getSimpleName()
			);
		}	

		if(nome instanceof Serializable) {
			System.out.println(
				"e " + Serializable.class.getSimpleName()
			);
		}		

		if(nome instanceof CharSequence) {
			System.out.println(
				"e " + CharSequence.class.getSimpleName()
			);
		}

		Serializable serializable = "serio";
		System.out.println(serializable);
	}

	public static void teste(Object value) {
		if(value instanceof Integer) {
			System.out.print("e ");
		} else {
			System.out.print("nao e ");
		}
		System.out.println(Integer.class.getSimpleName());
	}
}
