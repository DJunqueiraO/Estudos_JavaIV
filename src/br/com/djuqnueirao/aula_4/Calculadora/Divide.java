public class Divide implements Operation {

	@Override
	public double calculate(double x, double y) {
		return x / y;
	}
	
	@Override
	public String toString() {
		return "/";
	}
}