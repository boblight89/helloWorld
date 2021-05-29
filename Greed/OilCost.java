package test;

import java.util.Scanner;

public class OilCost {

	long[] cost;
	long[] distance;
	
	public OilCost(Scanner sc,int n) {
		distance = new long[n-1];
		cost = new long[n];
		for(int i = 0 ; i < distance.length; i++) {
			distance[i] = sc.nextInt();
		}

		for(int i = 0 ; i < cost.length; i++) {
			cost[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		OilCost oil = new OilCost(sc, n);
		sc.close();
		
		long result = oil.getMinCost();
		System.out.println(result);
	}

	private long getMinCost() {
		long result = 0;
		long currCost = cost[0];
		for(int i = 0 ; i < distance.length ; i++) {
			result += currCost*distance[i];
			if(currCost > cost[i+1]) {	//도착한 도시의 비용이 더 쌀경우
				currCost = cost[i+1];	//기름을 여기서 채운다.
			}
		}
		
		return result;
	}
}
/*
 주유소 문제 - 1km당 1L를 쓰는 차로 첫 도시부터 마지막 도시까지 여행을 할때, 최소 기름값을 출력하는 클래스
 입력
 첫줄 - 도시 수 N (2 <= N <= 100,000)
 둘째줄 - N-1만큼의 각 도시간 거리 (각 거리는 1이상 1,000,000,000 이하의 자연수)
 셋째줄 - N만큼의 각 도시별 기름값 (각 기름값음 1이상 1,000,000,000 이하의 자연수)
 */