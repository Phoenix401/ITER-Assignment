package March_15;
//Write a program to find out the sum of digits of a number.
//The Number is in form of string
public class p3_StringNumberSum {
	public static void main(String[] args) {
		StringNumToSum("123");
	}
	public static void StringNumToSum(String x) {
		int count=0;
		int sum = 0;											count++;
		int i=0;												count++;
		while(i<x.length()) {
			sum+=Integer.parseInt(x.charAt(i)+"");				count++;
			i++;												count++;
		}
		System.out.println(sum);								count++;
		System.out.println("The Time Taken is "+count);
	}
}
