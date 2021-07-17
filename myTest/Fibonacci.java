package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		
		int result = fibonacci(i);
		System.out.println(result);
	}

	//����Լ��� ����Ѵٸ� �̷��� ���̴�.
	private static int fibonacci(int i) {
		if(i==0) return 0;
		if(i==1) return 1;
		else return fibonacci(i-1) + fibonacci(i-2);
	}
}

/*
����
�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

���
ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.

�Է¿���
10

��¿���
55
*/