package app.cleancode.pi_finder;

public class Main {
public static void main(String[] args) {
	System.out.println(getPi());
}
public static final long precision = 500000l;
public static double getPi () {
	boolean operation = true;
	double total = 3;
	for (long i = 0; i < precision; i ++) {
		total += getNext(i * 2 + 2, operation);
		operation = !operation;
	}
	return total;
}
public static double getNext (double divisor, boolean operation) {
	double result = 4d / (divisor * (divisor + 1) * (divisor + 2));
	if (!operation) {
		result *= -1;
	}
	return result;
}
}
