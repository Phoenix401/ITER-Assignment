package March_18;

public class TimeComplexityRecursion {
//	WAP to write a Recursive Program and Find its Time complexity.
	public static void main(String[] args) {
//		System.out.println(factorial(5));
		int[] arr = new int[]{1,2,66,4,5,6,7};
//		System.out.println(sendSum(1, arr));
		
		System.out.println(findGreatest(1, arr));
	}
	public static int factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);
	}
//	Sum of Array using Recursion
	public static int sendSum(int i , int[] arr) {
		if(i>arr.length-1) return arr[i-1];
		else {
			arr[i]=arr[i]+arr[i-1];
			return sendSum(i+1,arr);
		}
	}
//	Greatest Element in the array
	public static int findGreatest(int i , int[] arr) {
		if(i>arr.length-1) return arr[i-1];
		else{
			if(arr[i]<arr[i-1]) {
				arr[i] = arr[i-1];
			}
			return findGreatest(i+1, arr);
		}		
	}
}
