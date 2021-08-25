package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			//����: ������ �� �ٻ�ġ�� ���� ������ ���� �ִ�.
			//double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
			//double small = Math.abs(r1-r2);
			//double big = r1+r2;
			double d = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
			double small = Math.pow(r1-r2,2);
			double big = Math.pow(r1+r2,2);
			System.out.println(small + " " + big + " " + d);
			
			if(d == 0) {
				if(r1 == r2) {
					System.out.println(-1);
				}else {
					System.out.println(0);
				}
			}else {
				if(d == big || d == small) {
					System.out.println(1);
				}else if(d > small && d < big) {
					System.out.println(2);
				}else {
					System.out.println(0);
				}
			}
			
		}
	}
}
/*
����
�������� ���ȯ�� �ͷ��� �ٹ��ϴ� �����̴�. ������ ���� ���簨�� ��� �α����� �������� �ʴ´�.
�̼����� �������� ���ȯ���� ����� ����(�����)�� ��ġ�� ����϶�� ����� ���ȴ�.
�������� ���ȯ�� ���� �ڽ��� �ͷ� ��ġ���� ���� �������� �Ÿ��� ����ߴ�.

�������� ��ǥ (x1, y1)�� ���ȯ�� ��ǥ (x2, y2)�� �־�����,
�������� ����� �������� �Ÿ� r1�� ���ȯ�� ����� �������� �Ÿ� r2�� �־����� ��,
������� ���� �� �ִ� ��ǥ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� ������ ���� �̷���� �ִ�.
�� �ٿ� x1, y1, r1, x2, y2, r2�� �־�����.
x1, y1, x2, y2�� -10,000���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̰�, r1, r2�� 10,000���� �۰ų� ���� �ڿ����̴�.

���
�� �׽�Ʈ ���̽����� ������� ���� �� �ִ� ��ġ�� ���� ����Ѵ�. ���� ������� ���� �� �ִ� ��ġ�� ������ ���Ѵ��� ��쿡�� -1�� ����Ѵ�.

�Է¿���
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5

��¿�
2
1
0
*/
/*
�ͷ� �̶� ������, �� ���� ��ġ���踦 ����ϴ°�.
�� ���� �Ÿ��� D �� �ϰ�, r1, r2�� ���� �������̶�� ��������,
����� ���� �� ���� ������ ���, �� ���� ������ ���, ������ �ʴ°��, ��ġ�ϴ� ���(����)���� ���� �ִ�.

�� ���� ������ ���
D = r1 + r2
D = r1 - r2

�� ���� ������ ���
r1 - r2 < D < r1 + r2

������ �۴� ���
D < r1 - r2
D > r1 + r2
D = 0 , r1 != r2

������ ���
D = 0 , r1 = r2
 */