package March_17;

// WAP to find the sum of 1,2,4,8,16 till the sum is less than n
//	find the time  complexity and represent using BigOh-
public class P1_SumOfSum {
	public static void main(String[] args) {
//		findSum(8);
//		findStar(8);
		int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3}};
		
		int[][] sum = new int[3][3];
		sum = findSum(arr,arr2 );
		for(int i=0 ; i<sum.length ; i++) {
			for(int j=0 ; j<sum.length ; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void findSum(int n) {
		int j = 1;
		int sum = 1;
		while (j <= n) {
			sum += j;
			j *= 2;
		}
		System.out.println("The Sum is " + sum);
	}
	public static void findStar(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int  j=1 ; j<=i ; j++) {
				System.out.print(" *    ");
			}
			System.out.println();
		}
	}
	public static int[][] findSum(int a[][] , int b[][]) {
		int sum[][] = new int[a.length][a.length];
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a.length ; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}
}
