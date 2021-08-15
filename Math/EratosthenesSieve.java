package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EratosthenesSieve {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		//������ �� ���� �Ҽ����� �迭
		boolean[] isPrime = new boolean[end+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;	//0�� 1�� �Ҽ��� �ƴϴ�.
		
		//�����佺�׳׽��� ü
		for(int i = 2; (i*i) <= end; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= end ;j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		//start ���� end ���� true �� �׸� ���
		for(int i = start ; i <= end ; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
		
	}

}
/*
����
M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.

���
�� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.

�Է¿�
3 16

��¿�
3
5
7
11
13
*/