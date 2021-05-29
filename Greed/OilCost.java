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
			if(currCost > cost[i+1]) {	//������ ������ ����� �� �Ұ��
				currCost = cost[i+1];	//�⸧�� ���⼭ ä���.
			}
		}
		
		return result;
	}
}
/*
 ������ ���� - 1km�� 1L�� ���� ���� ù ���ú��� ������ ���ñ��� ������ �Ҷ�, �ּ� �⸧���� ����ϴ� Ŭ����
 �Է�
 ù�� - ���� �� N (2 <= N <= 100,000)
 ��°�� - N-1��ŭ�� �� ���ð� �Ÿ� (�� �Ÿ��� 1�̻� 1,000,000,000 ������ �ڿ���)
 ��°�� - N��ŭ�� �� ���ú� �⸧�� (�� �⸧���� 1�̻� 1,000,000,000 ������ �ڿ���)
 */