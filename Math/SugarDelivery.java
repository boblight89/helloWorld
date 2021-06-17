package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SugarDelivery {
	static final int INF = 99999;
	int[] sugar;
	
	SugarDelivery(){
		sugar = new int [5001];
		Arrays.fill(sugar, INF);
		sugar[3] = 1;
		sugar[5] = 1;
	}
	
	public static void main(String[] args) throws IOException {
		 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		
		SugarDelivery su = new SugarDelivery();
		
		su.calcSugar(n);
		
		if(su.sugar[n] != INF)	System.out.println(su.sugar[n]);
		else System.out.println(-1);
		
		su.calcSugarExample(n);
	}

	private void calcSugarExample(int n) {
		//다이나믹 프로그래밍이 아닌 다른 방법으로 푼 방법. 5로 나누어떨어질때까지 3을 뺀다.
		int ans = -1;
		int l = 0;
		while(n >= 0) {
			if(n%5 == 0) {
				ans = (n/5) + l;
				break;
			}
			n -=3;
			l++;
		}
		System.out.println(ans);
		
	}

	private void calcSugar(int n) {
		
		for(int i = 6 ; i <= n; i++) {
			if(sugar[i-3] != INF) {
				if(sugar[i] > sugar[i-3] + 1) {
					sugar[i] = sugar[i-3] + 1;
				}
			}
			if(sugar[i-5] != INF) {
				if(sugar[i] > sugar[i-5] + 1) {
					sugar[i] = sugar[i-5] + 1;
				}
			}
		}
		
	}

}
/*
 다이나믹 프로그래밍을 이용해보자. for문 최대 5000에 1초면 충분한 시간이다.
 */
/*
시간제한 : 1초
메모리 제한 : 128MB

상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

출력
상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
*/