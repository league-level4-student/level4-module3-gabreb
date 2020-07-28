package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double dividend, double divisor) throws IllegalArgumentException {
		if (divisor==0) {
			throw new IllegalArgumentException();
		}
		double k = dividend/divisor;
		return k;
	}
	public static String reverseString(String s) throws IllegalStateException {
		if (s.isEmpty()) {
			throw new IllegalStateException();
		}
		String a = "";
		for (int i = s.length()-1; i > -1; i--) {
			a += s.charAt(i);
		}
		return a;
	}
}
