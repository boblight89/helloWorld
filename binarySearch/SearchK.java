package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchK {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int result = binarySearchK(k,n);
		System.out.println(result);
	}

	private static int binarySearchK(int k,int n) {
		int result = 0;
		int start = 1;
		int end = k;
		while(start <= end) {
			int mid = (start + end) /2;
			int cnt = 0;
			for(int i = 1 ; i <= n ; i++) {
				cnt += Math.min(mid/i, n);
			}
			
			if(cnt >= k) {
				end = mid-1;
				result = mid;
			}else {
				start = mid+1;
			}
		}
		return result;
	}
}

/*
�����̴� ũ�Ⱑ N��N�� �迭 A�� �������. �迭�� ����ִ� �� A[i][j] = i��j �̴�.
�� ���� ������ �迭 B�� ������ B�� ũ��� N��N�� �ȴ�. B�� �������� �������� ��, B[k]�� ���غ���.
�迭 A�� B�� �ε����� 1���� �����Ѵ�.

�Է�
ù° �ٿ� �迭�� ũ�� N�� �־�����. N�� 10^5���� �۰ų� ���� �ڿ����̴�. 
��° �ٿ� k�� �־�����. k�� min(10^9, N^2)���� �۰ų� ���� �ڿ����̴�.

���
B[k]�� ����Ѵ�.

���� �Է�
3
7

���� ���
6
*/
/*
����Ž������ Ǯ�� �ִ� ����

N �� 5��� ������������ �迭
1  2  3  4  5
2  4  6  8 10
3  6  9 12 15
4  8 12 16 20
5 10 15 20 25

�׸��� ���⿡�� k = 11 �� ��, �� B[11] �� ã�� ��츦 �����غ���.

�츮�� ã�� 11��°�� ���ڸ� S �̶�� �Ѵٸ�, ������ ���� �����ؾ� �Ѵ�.
"��ü ���� �߿���, S���� �۰ų� ���� ������ ������ 11������ ������ �ȵȴ�!"
�� ���� �׷��ٸ�, ã�� ������ ������ ū ������ �Űܾ� �Ѵ�.
�׷��ٸ�, S���� �۰ų� ���� ������ ������ ��� ���ұ�?
�� ����� �����ϴ� ���� �� �˰����� �ٽ��� �ǰڴ�.

���� S�� 5��� �����ϰ�, 5���� �۰ų� ���� ������ ã�� ��츦 �����غ���.

1  2  3  4  5 		5
2  4  6  8 10 		2
3  6  9 12 15 		1
4  8 12 16 20 		1
5 10 15 20 25 		1

5���� �۰ų� ���� ������ ���Ϸ���, �� �࿡�� ���ǿ� �´� ���� ���� �� ���ϸ� �ȴ�.
��, �� �迭���� 5���� �۰ų� ���� ������ ���� 10���̴�.

�׷��ٸ� S�� 8�̶�� �����غ���.

1  2  3  4  5 		5
2  4  6  8 10 		4
3  6  9 12 15 		2
4  8 12 16 20 		2
5 10 15 20 25 		1
���⿡���� 14�̴�.

���� ���� ����, �� �࿡���� S���� �۰ų� ���� ������ ������
min(S / i, N) ���� �� �� �ִ�.
�ֳ��ϸ�, �� ����
i * 1,   i * 2,   i * 3,   i * 4,   .....   , i * j �̱� ������,
S�� i�� ���� ���� �������� ���� ���� �� �࿡�� S���� �۰ų� ���� ������ �Ǳ� �����̴�.

�׷��Ƿ�, �츮�� S�� ã�� ����
�ʱⰪ = 1,   ������ �� = k,   �߰� �� = (1 + k) / 2
�� �����ϴ� �̺� Ž���� �����ϸ� �ȴ�.
���⿡�� ������ ���� k�� ������
"B[k] �� ���� k���� �۰ų� ����" �����̴�.
*/