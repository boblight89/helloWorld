package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin0 {
	
	int[] coin;

	Coin0(int[] coin){
		this.coin = coin;
		Arrays.sort(this.coin);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int pay = Integer.parseInt(st.nextToken());
		while(n > 10 || n < 0) {
			System.out.println("동전은 1~10가지여야 합니다.");
			st = new StringTokenizer(bf.readLine()," ");
			n = Integer.parseInt(st.nextToken());
		}
		int[] coin = new int[n];
		for(int i = 0 ; i < n ;) {
			st = new StringTokenizer(bf.readLine()," ");
			coin[i] = Integer.parseInt(st.nextToken());
			if(i == 0 && coin[i] != 1) {
				System.out.println("첫번째 동전은 1이어야 합니다.");
			}else if(i != 0 && coin[i] % coin[i-1] != 0) {
				System.out.println("동전은 이전 동전의 배수의 가치여야 합니다.");
			}else {
				i++;
			}
		}
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
/*
 	그리드 알고리즘1
	거스름돈 구하는 클래스
	첫줄 입력에 동전 종류N과 거스름돈M을 입력 (1 <= N <= 10, 1<= M)
	두번째줄부터 N+1줄까지 각 동전의 가치를 입력 (첫 입력은 무조건 1이어야 하고, 다음 입력은 이전 입력의 배수여야만 한다.)
	동전의 개수를 출력하고 종료한다.
*/

