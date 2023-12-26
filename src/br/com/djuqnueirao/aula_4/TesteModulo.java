public class TesteModulo {

	static {
    		int modulo = 10 % 2;
    		System.out.println(modulo); 
            
    		modulo = -10 % -3;
    		System.out.println(modulo); 
            
    		int moduloJava8 = Math.floorMod(10, 2);
    		System.out.println(moduloJava8);    
            
    		moduloJava8 = Math.floorMod(-10, -3);
    		System.out.println(moduloJava8);    

		int a = -10;
        	int b = 3;

        	int moduloOperator = a % b;
        	System.out.println("Resultado com operador '%': " + moduloOperator);
		int moduloFloorMod = Math.floorMod(a, b);
        	System.out.println("Resultado com Math.floorMod: " + moduloFloorMod);
	}

	public static void main(String... args) {
	}
}