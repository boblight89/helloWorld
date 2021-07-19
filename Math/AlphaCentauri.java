package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlphaCentauri {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		
		int[] result = new int[repeat];
		for(int i = 0 ; i < repeat ; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int distance = end - start;
			int max = (int)Math.floor(Math.sqrt(distance));
			if(max*max == distance) {
//				System.out.print("case1: ");
				result[i] = max*2 - 1;
			}else if(max*max + max >= distance) {
//				System.out.print("case2: ");
				result[i] = max*2;
			}else {
//				System.out.print("case3: ");
				result[i] = max*2 + 1;
			}
//			System.out.println("distance = "+ distance+", max ="+max +", count = "+result[i]);
		}
		for(int i = 0 ; i < repeat ; i++) {
			System.out.println(result[i]);
		}

	}

}
/*
 * Ǯ��
1 - 1 // 1
1 1 - 2 // 2
1 2 1 - 4 // 3
1 2 2 1 - 6 // 4
1 2 3 2 1 - 9 // 5
1 2 3 3 2 1 - 12 // 6
1 2 3 4 3 2 1 - 16 // 7
1 2 3 4 4 3 2 1 - 20 // 8
1 2 3 4 5 4 3 2 1 - 25 // 9
1 2 3 4 5 5 4 3 2 1 - 30 // 10
1 2 3 4 5 6 5 4 3 2 1 - 36 // 11
1 2 3 4 5 6 6 5 4 3 2 1 - 42 // 12
1 2 3 4 5 6 7 6 5 4 3 2 1 - 49 // 13
1 2 3 4 5 6 7 7 6 5 4 3 2 1 - 56 // 14
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 - 64 // 15
max���� ���� ���� �����°��� �Ÿ��� max^2�϶�
�� �ִ� �̵��Ÿ��� �̵� Ƚ���� �� 2 ����

ex) max = 5 �ϰ��
1 2 3 4 5 4 3 2 1 : 25 -- max^2
1 2 3 4 5 5 4 3 2 1 : 30 -- max^2+max
1 2 3 4 5 5 5 4 3 2 1 : 35 -- max���� ������ �ʴ� �ִ밪
1 2 3 4 5 6 5 4 3 2 1 : 36 -- max���� ��ȭ

max = sqrt(distance) �ϰ�� -- max�� ���� �ּҰ�
count = 2*max-1

distance <= max*max + max �ϰ�� 
count = 2*max

distance �� �׺��� �������
count = 2*max+1
*/

/*
 * ����
�����̴� � ����, ���� ���� �ٸ� �༺������ �η����� ��ư� �� �ִ� �̷��� ������ �Ͼ���.
�׸��� �װ� ������� ���� ���� ���� ���� �� 23���� ���� ����, ���� �ֿ��� ASNA ���� ����簡 �Ǿ� ���ο� ���迡 ���� ���� ���� ������ ������ ��ٸ��� �ִ�.

�װ� ž���ϰ� �� ���ּ��� Alpha Centauri��� ���ο� �η��� �����ڸ��� ��ô�ϱ� ���� ��Ը� ��Ȱ ���� �ý����� ž���ϰ� �ֱ� ������,
�� ũ��� ������ ��û�� ������ �ֽű������ �� �����Ͽ� ������ �����̵� ��ġ�� ž���Ͽ���.
������ �� �����̵� ��ġ�� �̵� �Ÿ��� �ް��ϰ� �ø� ��� ��迡 �ɰ��� ������ �߻��ϴ� ������ �־,
���� �۵��ñ⿡ k������ �̵��Ͽ��� ���� k-1 , k Ȥ�� k+1 ���⸸�� �ٽ� �̵��� �� �ִ�.
���� ���, �� ��ġ�� ó�� �۵���ų ��� -1 , 0 , 1 ������ �̷л� �̵��� �� ������ ��ǻ� ���� Ȥ�� 0 �Ÿ���ŭ�� �̵��� �ǹ̰� �����Ƿ�
1 ������ �̵��� �� ������, �� �������� 0 , 1 , 2 ������ �̵��� �� �ִ� ���̴�.
( ���⼭ �ٽ� 2������ �̵��Ѵٸ� ���� �ñ⿣ 1, 2, 3 ������ �̵��� �� �ִ�. )

������� �����̵� ��ġ �۵����� ������ �Ҹ� ũ�ٴ� ���� �� �˰� �ֱ� ������ x�������� y������ ���� �ּ����� �۵� Ƚ���� �̵��Ϸ� �Ѵ�.
������ y������ �����ؼ��� ���� �̵���ġ�� �������� ���Ͽ� y������ �����ϱ� �ٷ� ������ �̵��Ÿ��� �ݵ�� 1�������� �Ϸ� �Ѵ�.

������� ���� x�������� ��Ȯ�� y�������� �̵��ϴµ� �ʿ��� ���� �̵� ��ġ �۵� Ƚ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��϶�.

�Է�
�Է��� ù �ٿ��� �׽�Ʈ���̽��� ���� T�� �־�����. ������ �׽�Ʈ ���̽��� ���� ���� ��ġ x �� ��ǥ ��ġ y �� ������ �־�����,
x�� �׻� y���� ���� ���� ���´�. (0 �� x < y < 231)

���
�� �׽�Ʈ ���̽��� ���� x�������κ��� y�������� ��Ȯ�� �����ϴµ� �ʿ��� �ּ����� �����̵� ��ġ �۵� Ƚ���� ����Ѵ�.

���� �Է�
3
0 3
1 5
45 50

���� ���
3
3
4
*/