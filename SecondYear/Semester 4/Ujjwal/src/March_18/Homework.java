package March_18;

public class Homework {
	public static void star(int i , int j , int n) {
		if(j<n) {
			if(i<j) {
				System.out.print(" * ");
				star(i+1,j,n);
			}
			else {
				System.out.println();
				star(0,j+1,n);
			}
		}
	}
	public static void fibonacciSeries(int i , int j , int n) {
		if(n!=0) {
			System.out.print(i+" ");
			fibonacciSeries(j, i+j, n-1);
		}
	}
	public static void GPSeries(int i , int j , int k) {
		if(i<k) {
			System.out.print(i+" ");
			GPSeries(i*j, j, k);
		}
	}
	public static void powerOfX(int x , int y , int z) {
		if(z!=1) {
			powerOfX(x*y, y , z-1);
		}
		else {
			System.out.print(x+" ");
		}
	}
	public static void printMatrix(int[][] x , int i , int j) {
		if(j<x[0].length) {
			if(i<x.length) {
				System.out.print(x[i][j]+"   ");
				printMatrix(x, i+1, j);
			}
			else {
				System.out.println();
				printMatrix(x, 0, j+1);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("-------Star--------------------");
		star(0,0,5);
		System.out.println("-------Fibonacci Series--------");
		fibonacciSeries(0, 1 , 5);
		System.out.println();
		System.out.println("--------GP Series--------------");
		GPSeries(2, 2, 100);
		System.out.println();
		System.out.println("--------x-Power-y Series--------");
		powerOfX(2,2, 4);
		System.out.println();
		System.out.println("--------Print Matrix--------");
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		printMatrix(arr, 0, 0);
		
	}
}
