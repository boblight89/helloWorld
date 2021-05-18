package test;

import java.util.Arrays;
import java.util.Scanner;

public class Coin0 {
	
	int[] coin;

	Coin0(int[] coin){
		this.coin = coin;
		Arrays.sort(this.coin);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int pay = sc.nextInt();
		int[] coin = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			coin[i] = sc.nextInt();
		}
		sc.close();
		Coin0 gt = new Coin0(coin);
		int result = gt.divide(pay);
		System.out.println(result);
	}

	private int divide(int pay) {
		int result = 0;
		for(int i = coin.length -1 ; i >= 0 ; i--) {
			result += pay/coin[i];
			pay = pay%coin[i];
		}
		return result;
	}

}
