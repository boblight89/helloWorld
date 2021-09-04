package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj1009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int repeat = 0 ; repeat < t ; repeat++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//��ǻ�ʹ� 10�� - a�� ���̰� ���� 10�� �ʰ��Ҽ� ����.
			a = a%10;
			if(a == 0) a = 10;
			/*
			���1: a%10 �� b��ŭ ������ 1���ڸ����� ��Ÿ���� ���. b�� 10������ �̱⿡ ������. 
			int temp = 1;
			for(int i = 1 ; i <= b ; i++) {
				temp = temp*a;
				temp %= 10;
			}
			if(temp == 0) temp = 10;
			System.out.print(temp + " / ");
			*/
			//���2 : ���� �ݺ��Ǵ� ����ŭ b�� ������������ �����. - ��� 1�� ���� �ӵ��� 1/10 ������ �پ���.
			//���ر��� ���1: 1448ms / ���2: 188ms
			int[] bb = new int[11];
			bb[0] = 1;
			int limit = 0;
			for(int i = 1 ; i < 11 ; i++) {
				int next = bb[i-1] * a;
				next = next % 10;
				if(next == 0) next = 10;
				bb[i] = next;
				if(bb[i] == bb[1] && i != 1) {
					limit = i-1;
					break;
				}
				if(i == 10) {
					limit = 10;
				}
			}
			int tt = b%limit;
			if(tt == 0) tt = limit;
			System.out.println(bb[tt]);
			
		}
		br.close();
	}

}

/*
����
����̴� �ֽ� ��ǻ�� 10�븦 ������ �ִ�.
��� �� ����̴� ���� �����͸� ó���ؾ� �� ���� ���ܼ� �� ��ǻ�Ϳ� 1������ 10�������� ��ȣ�� �ο��ϰ�,
10���� ��ǻ�Ͱ� ������ ���� ������� �����͵��� ó���ϱ�� �Ͽ���.

1�� �����ʹ� 1�� ��ǻ��, 2�� �����ʹ� 2�� ��ǻ��, 3�� �����ʹ� 3�� ��ǻ��, ... ,
10�� �����ʹ� 10�� ��ǻ��, 11�� �����ʹ� 1�� ��ǻ��, 12�� �����ʹ� 2�� ��ǻ��, ...

�� �������� ������ �׻� a^b���� ���·� �־�����.
����̴� ���� ������ �����Ͱ� ó���� ��ǻ���� ��ȣ�� �ñ�������. �̸� �������ִ� ���α׷��� �ۼ��϶�.

�Է�
�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� ���� �ٺ��� ������ �׽�Ʈ ���̽��� ���� ���� a�� b�� �־�����. (1 �� a < 100, 1 �� b < 1,000,000)

���
�� �׽�Ʈ ���̽��� ���� ������ �����Ͱ� ó���Ǵ� ��ǻ���� ��ȣ�� ����Ѵ�.

�����Է� 1
6
1 6
3 7
6 2
7 100
9 635
10 15

������� 1
1
7
6
1
9
10
*/