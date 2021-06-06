package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OilCost {

	long[] cost;
	long[] distance;
	
	public OilCost(BufferedReader br, StringTokenizer st, int n) throws IOException {
		distance = new long[n-1];
		cost = new long[n];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < distance.length; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < cost.length; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
	}

	public OilCost(int n) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		
		OilCost oil = new OilCost(br, st, n);
		
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
 
 �Է� ����		��¿���
 4			18
 2 3 1
 5 2 4 1

 */