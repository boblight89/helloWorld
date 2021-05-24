package test;

import java.util.Scanner;

public class RecursiveFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		RecursiveFunc fc = new RecursiveFunc();
		
		int result = fc.factorialFunc(n);
		System.out.println(result);
	}

	int factorialFunc(int x){
		if(x < 1) return 1;
		else return x * factorialFunc(x-1);
	}
}
