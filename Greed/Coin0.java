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
			System.out.println("������ 1~10�������� �մϴ�.");
			st = new StringTokenizer(bf.readLine()," ");
			n = Integer.parseInt(st.nextToken());
		}
		int[] coin = new int[n];
		for(int i = 0 ; i < n ;) {
			st = new StringTokenizer(bf.readLine()," ");
			coin[i] = Integer.parseInt(st.nextToken());
			if(i == 0 && coin[i] != 1) {
				System.out.println("ù��° ������ 1�̾�� �մϴ�.");
			}else if(i != 0 && coin[i] % coin[i-1] != 0) {
				System.out.println("������ ���� ������ ����� ��ġ���� �մϴ�.");
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
 	�׸��� �˰���1
	�Ž����� ���ϴ� Ŭ����
	ù�� �Է¿� ���� ����N�� �Ž�����M�� �Է� (1 <= N <= 10, 1<= M)
	�ι�°�ٺ��� N+1�ٱ��� �� ������ ��ġ�� �Է� (ù �Է��� ������ 1�̾�� �ϰ�, ���� �Է��� ���� �Է��� ������߸� �Ѵ�.)
	������ ������ ����ϰ� �����Ѵ�.
*/

