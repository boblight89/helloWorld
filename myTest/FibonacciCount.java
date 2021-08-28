package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciCount {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//�Ǻ���ġ �ʱ�ȭ - 0�� 1�� ���� �̸� ����صд�.
		int[] count0 = new int[41];
		int[] count1 = new int[41];
		count0[0] = 1; count0[1] = 0; count0[2] = 1;
		count1[0] = 0; count1[1] = 1; count1[2] = 1;
		for(int i = 3; i < 41 ; i++) {
			count0[i] = count0[i-1] + count0[i-2];
			count1[i] = count1[i-1] + count1[i-2];
		}
		//�Է¹��� ����ŭ ����� 0,1 ī��Ʈ�� �������� �ȴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t ; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(count0[num] + " " +count1[num]);
		}
		br.close();
	}
}
/*
fibonacci(3)�� ȣ���ϸ� ������ ���� ���� �Ͼ��.

    fibonacci(3)�� fibonacci(2)�� fibonacci(1) (ù ��° ȣ��)�� ȣ���Ѵ�.
    fibonacci(2)�� fibonacci(1) (�� ��° ȣ��)�� fibonacci(0)�� ȣ���Ѵ�.
    �� ��° ȣ���� fibonacci(1)�� 1�� ����ϰ� 1�� �����Ѵ�.
    fibonacci(0)�� 0�� ����ϰ�, 0�� �����Ѵ�.
    fibonacci(2)�� fibonacci(1)�� fibonacci(0)�� ����� ���, 1�� �����Ѵ�.
    ù ��° ȣ���� fibonacci(1)�� 1�� ����ϰ�, 1�� �����Ѵ�.
    fibonacci(3)�� fibonacci(2)�� fibonacci(1)�� ����� ���, 2�� �����Ѵ�.

1�� 2�� ��µǰ�, 0�� 1�� ��µȴ�. N�� �־����� ��, fibonacci(N)�� ȣ������ ��, 0�� 1�� ���� �� �� ��µǴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. N�� 40���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

���
�� �׽�Ʈ ���̽����� 0�� ��µǴ� Ƚ���� 1�� ��µǴ� Ƚ���� ��
������ �����ؼ� ����Ѵ�.

�����Է�
3
0
1
3

���� ���
1 0
0 1
1 2
*/