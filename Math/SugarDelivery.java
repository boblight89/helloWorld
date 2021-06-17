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
		//���̳��� ���α׷����� �ƴ� �ٸ� ������� Ǭ ���. 5�� ��������������� 3�� ����.
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
 ���̳��� ���α׷����� �̿��غ���. for�� �ִ� 5000�� 1�ʸ� ����� �ð��̴�.
 */
/*
�ð����� : 1��
�޸� ���� : 128MB

����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� �־�����. (3 �� N �� 5000)

���
����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
*/