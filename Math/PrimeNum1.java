package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum1 {

	private static boolean isPrime(int num) {
		boolean result = true;
		if(num < 2) result = false;
		else if(num <= 3) result =  true;
		else {
			for(int i = 2; i < num/2 + 1 ; i++) {
				if(num % i == 0) {
					result = false;
					break;
				}
			}
		}		
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(isPrime(num)) result += 1;
		}
		System.out.println(result);

	}

}
/*
����
�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.

���
�־��� ���� �� �Ҽ��� ������ ����Ѵ�.

�Է¿���
4
1 3 5 7

��¿���
3
*/
