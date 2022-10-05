package poc;

import java.math.BigDecimal;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal a = new BigDecimal(2);
		BigDecimal b = new BigDecimal(Integer.MAX_VALUE);
		BigDecimal result = powered(a, b);
		
		/*try {
			byte[] resultBytes = result.toPlainString().getBytes();
			Files.write(Path.of("abc.txt"), resultBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		System.out.println("Done");

	}
	
	public static BigDecimal powered(BigDecimal a, BigDecimal b) {
		if(b == BigDecimal.ONE) {
			return a;
		}else if(b == BigDecimal.ZERO) {
			return BigDecimal.ONE;
		}
		BigDecimal temp = powered(a, b.divideToIntegralValue(BigDecimal.valueOf(2)));
		BigDecimal result = null;
		if(b.remainder(BigDecimal.valueOf(2)) == BigDecimal.ONE) {
			result = a.multiply(temp).multiply(temp);
		}else if(b.remainder(BigDecimal.valueOf(2)) == BigDecimal.ZERO) {
			result = temp.multiply(temp);
		}
		return result;
	}

}
