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
	���� ���� - ù°�ٿ� ī��� N�� ���� M�� �־�����.
	��°�ٿ� N��ŭ �� ī���� ���ڰ� �־�����.
	3�忡 ī�带 �������, ���� ���ǿ��� �̱�� �ִ� ���� ū ���� ���ϴ� Ŭ����
	
	�Է�����
	3 �� N �� 100
	10 �� M �� 300,000
	�� ī��� 100,000 �� ���� �ʴ� ��������
* ������ �¸����� : �־��� ���ڸ� ���� �����鼭, ���ڿ� ���� ����� ����� �¸� 
*/