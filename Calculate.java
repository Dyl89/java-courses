public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int st = Integer.valueOf(arg[2]);
		int summ = first + second;
		int minus = first - second;
		int del = first / second;
		int umn = first * second;
		int step = (int)Math.pow(first, st);
		System.out.println("Sum " + summ);
		System.out.println("minus " + minus);
		System.out.println("Del " + del);
		System.out.println("Umn " + umn);
		System.out.println("step " + step);
	}
}