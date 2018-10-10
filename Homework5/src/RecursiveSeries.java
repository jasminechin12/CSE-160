// Jasmine Chin 111717723

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RecursiveSeries {
	public static BigDecimal ONE = new BigDecimal(1);
	public static BigDecimal m(int i) {
		if (i == 1)
			return ONE;
		else {
			BigDecimal num = new BigDecimal(Math.pow(-1, i+1)).divide(new BigDecimal(i), new MathContext(10, RoundingMode.HALF_EVEN));
			return m(i-1).add(num);
		}
	}
		
	public static void main(String[] args) {
		System.out.println(m(100));

	}

}
