package equsolver;

public class EquSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = -5;
		int c = -4;
		int aa = 0;
		int ab = a * c;
		// int[] num = new int[ab];
		System.out.println(ab);

		// handling minus value problem beforing looping through it..
		int baba = ab;
		if (ab < 0) {
			ab = ab * (-1);
		}

		// looping direct
		for (int i = 1; i <= ab; i++) {
			aa = baba / i; 
			if ((baba % i) == 0 && b == aa + i) {
				System.out.println("\n" + a + " x^2 + (" + aa + "x) + (" + i+ "x) +" + c);
			}
		}
	}
}