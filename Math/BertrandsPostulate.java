package test.math;

import java.util.Arrays;
import java.util.Scanner;

public class BertrandsPostulate {

	public boolean[] prime;
	
	BertrandsPostulate(){
		//�̸� �����佺�׳׽��� ü �� �̿� �ؼ� �Ҽ����θ� ���Ѵ�.
		prime = new boolean[123456*2 + 1];	//��ü �Ҽ����θ� ���Ѵ�.
		Arrays.fill(prime, true);
		prime[0] =prime[1] = false;	//0�� 1�� �Ҽ��� �ƴϴ�.
		
		for(int i = 2; (i*i) <= prime.length; i++) {
			if(prime[i]) {
				for(int j = i*i; j <= prime.length ;j += i) {
					prime[j] = false;
				}
			}
		}
	}
	
	public int getPrimeNum(int n){
		int result = 0;
		for(int i = n+1 ; i <= 2*n ; i++) {
			if(prime[i]) result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		//��ĳ�ʷ� ����.
		Scanner sc = new Scanner(System.in);
		BertrandsPostulate mn = new BertrandsPostulate();
		int num = sc.nextInt();
		while(num != 0) {
			System.out.println(mn.getPrimeNum(num));
			num = sc.nextInt();
		}
		sc.close();
	}
}
/*
����

����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
�� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
���� ���, 10���� ũ��, 20���� �۰ų� ���� �Ҽ��� 4���� �ִ�. (11, 13, 17, 19) ��, 14���� ũ��, 28���� �۰ų� ���� �Ҽ��� 3���� �ִ�. (17,19, 23)
�ڿ��� n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϴ� �� �ٷ� �̷���� �ִ�.
�Է��� ���������� 0�� �־�����.

���
�� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.

����
1 �� n �� 123,456

�Է¿���
1
10
13
100
1000
10000
100000
0

��¿���
1
4
3
21
135
1033
8392

*/