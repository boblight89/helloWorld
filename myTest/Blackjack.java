package test;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] cards = new int[n];
		for(int i = 0 ; i < n ; i++) {
			cards[i] = sc.nextInt();
		}
		sc.close();
		
		int result = 0;
		
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1 ; j++) {
				for(int k = j+1; k < n ; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if(sum > result && sum <= m) result = sum;
					if(result == m) break;
				}
			}
		}
		
		System.out.println(result);

	}

}
/*
	변형 블랙잭 - 첫째줄에 카드수 N과 숫자 M이 주어진다.
	둘째줄에 N만큼 각 카드의 숫자가 주어진다.
	3장에 카드를 골랐을때, 블랙잭 조건에서 이길수 있는 가장 큰 수를 구하는 클래스
	
	입력조건
	3 ≤ N ≤ 100
	10 ≤ M ≤ 300,000
	각 카드는 100,000 을 넘지 않는 양의정수
* 블랙잭의 승리조건 : 주어진 숫자를 넘지 않으면서, 숫자에 가장 가까운 사람이 승리 
*/