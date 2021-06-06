package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blackjack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] cards = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < n ; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
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

	�Է¿���			��¿���
	5 21			21
	5 6 7 8 9

*/