package test;

import java.util.Arrays;
import java.util.Scanner;

public class GreedAtm {

	int[] person;
	
	GreedAtm(int[] p){
		person = p;
		Arrays.sort(person);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0 ; i < n ; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		
		GreedAtm mn = new GreedAtm(p);
		
		long result = mn.getTime();
		System.out.println(result);
	}

	private long getTime() {
		long result = 0;
		for(int i = 0 ; i < person.length; i++) {
			int partTime = 0;
			for(int j = 0 ; j <= i ; j++) {
				partTime += person[j];
			}
			result += partTime;
		}
		return result;
	}
}
