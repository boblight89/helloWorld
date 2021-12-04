package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj5575_TimeCard {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] empIn = new int[3][3];
		int[][] empOut = new int[3][3];
		
		for(int i = 0 ; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < 3; j++) {
				empIn[i][j] = Integer.parseInt(st.nextToken());
			}
			for(int j = 0 ; j < 3; j++) {
				empOut[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		for(int i = 0 ; i < 3 ; i++) {
			int[] result = new int[3];
			for(int j = 2 ; j >= 0 ; j--) {
				result[j] = empOut[i][j] - empIn[i][j];
				if(result[j] < 0 && j != 0) {
					empOut[i][j-1] -= 1;
					result[j]+=60;
				}
			}
			System.out.printf("%d %d %d\n",result[0],result[1],result[2]);
		}
	}

}
/*

����

JOI ���� ������ �ٹ��ð��� Ÿ�� ī��� �����ϰ��ִ�. �������� ���� ��� ����Ͽ� Ÿ�� ī�忡 ��� �ð��� ����Ѵ�. 
�ٹ��� ��ġ�� ����� ���� Ÿ�� ī�忡 ��� �ð��� ����Ѵ�. Ÿ��ī�忡�� ����ϴ� �ð������� 24 �ð����� ����Ѵ�.
���Ȼ��� ������ �������� ��� �ð��� 7�� �����̴�. ����, ��� ������ 23�� ������ ����Ѵ�. ������ ��� �ð��� �׻� ��� �ð����� �ʴ�.
�Է����� JOI ����� 3 ���� ���� A ��, B ��, C ���� ��� �ð��� ��� �ð��� �־� ���� �� �� ������ �ٹ��ð��� ����ϴ� ���α׷��� �ۼ��϶�.

�Է�
�Է��� 3 ������ �����ȴ�.
ù ��° �ٿ��� A ���� ��� �ð��� ��� �ð�,
�� ��° �ٿ��� B ���� ��� �ð��� ��� �ð�,
�� ��° �ٿ��� C ���� ��� �ð��� ��� �ð��� ���� �������� ���еǾ� �ִ�.
�ð��� ���� �������� ���е� 3 ���� ������ �������ִ�.

3 ���� ���� h(7 <= h <= 22), m(0 <= m <= 59), s(0 <= s <= 59)�� h�� m �� s �ʸ� ��Ÿ����.

���
ù ��° �ٿ� A ���� �ٹ� �ð�,
�� ��° �ٿ� B ���� �ٹ� �ð�,
�� ��° �ٿ� C ���� �ٹ� �ð��� ����϶�.

�ٹ� �ð��� h �ð� m �� s ���̸� h, m, s�� ������ �������� �и��Ͽ� ����϶�.

���� �Է� 1
9 0 0 18 0 0
9 0 1 18 0 0
12 14 52 12 15 30

���� ��� 1
9 0 0
8 59 59
0 0 38

*/