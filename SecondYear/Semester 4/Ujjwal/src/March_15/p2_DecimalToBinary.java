package March_15;

public class p2_DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(decimalToBinary(8));
	}
	public static String decimalToBinary(int x) {
		Long time = System.currentTimeMillis();
		String m ="";
		int c=1;
		while(x>0) {
			c+=1;
			m = x%2+m;
			c+=1;
			x/=2;
			c+=1;
		}
		c+=1;
		System.out.println("Time Complexity is "+c);
		Long time2 = System.currentTimeMillis()-time;
		System.out.println("The Total Time Complexity in Millisecond is "+time2);
		return m;
	}
}
// Write a program to find out the sum of digits of a number.
// The Number is in form of string