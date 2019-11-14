public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int subtr = first - second;
		int mult = first * second;
		int div = first / second;
		int exp = 1;
		for ( int i = 1; i <= second; i++)
			exp *= first;
		System.out.println("Sum = " + summ);
		System.out.println("Subtract = " + subtr);
		System.out.println("Multiplication = " + mult);
		System.out.println("Division = " + div);
		System.out.println("Exponent = " + exp);
	}
}