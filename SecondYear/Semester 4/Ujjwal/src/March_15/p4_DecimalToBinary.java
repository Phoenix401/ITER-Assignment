package March_15;
//	Write a program to convert Binary to Decimal and calculate its time complexity
public class p4_DecimalToBinary {
	public static void main(String[] args) {
		BinaryToDecimal("1011");
	}
	public static void BinaryToDecimal(String x) {
		int sum=0;
		for(int i=0 ; i<x.length() ; i++) {
			sum += (int) ( (int)Integer.parseInt(x.charAt(i)+"")*Math.pow(2, i));
		}
		System.out.println(sum);
	}
}
