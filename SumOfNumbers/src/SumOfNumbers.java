
public class SumOfNumbers {

	public static String getSum(int a, int b) {
		String equation = "";
		int sum = 0;
		int i;
		if (a <= b) {
			for (i = a; i <= b; i++) {
				sum = sum + i;
				if (i != a) {
					equation = equation + " + " + i;
				}
				else {
					equation = equation + i;
				}
			}
			return equation + " = " + sum;
		}
		else {
			return "";
		}
	}

}
