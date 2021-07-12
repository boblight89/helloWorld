package test.dfsbfs;
/*
����
������ ������ �ѳ��� ������ �������� ����� ���߸� ����ϱ�� �Ͽ���. 
����� ���� �ʰ� ���߸� ����Ϸ��� ���߸� �������κ��� ��ȣ�ϴ� ���� �߿��ϱ� ������,
�ѳ��� ���� ������ ȿ������ �����������̸� �����ϱ�� ����Ѵ�. �� �����̴� ���߱�ó�� �����ϸ� ������ ��� �������ν� ���߸� ��ȣ�Ѵ�.
Ư��, � ���߿� �����������̰� �� ������ ��� ������ �� �����̴� ������ �ٸ� ���߷� �̵��� �� �־�,
�� ���ߵ� ���� �������κ��� ��ȣ���� �� �ִ�. �� ������ �����¿� �� ���⿡ �ٸ� ���߰� ��ġ�� ��쿡 ���� �������ִ� ���̴�.

�ѳ��� ���߸� ����ϴ� ���� ���� ���ؼ� ���߸� �������� �ɾ� ���Ҵ�.
���ߵ��� ���ִ� ������ �����������̰� �� ������ ������ �ǹǷ� ���� �������ִ� ���ߵ��� �� ������ �����ִ��� �����ϸ� �� �� ������ �����̰� �ʿ����� �� �� �ִ�. ���� ��� ���߹��� �Ʒ��� ���� �����Ǿ� ������ �ּ� 5������ �����������̰� �ʿ��ϴ�.
0�� ���߰� �ɾ��� ���� ���� ���̰�, 1�� ���߰� �ɾ��� �ִ� ���� ��Ÿ����.

1 	1 	0 	0 	0 	0 	0 	0 	0 	0
0 	1 	0 	0 	0 	0 	0 	0 	0 	0
0 	0 	0 	0 	1 	0 	0 	0 	0 	0
0 	0 	0 	0 	1 	0 	0 	0 	0 	0
0 	0 	1 	1 	0 	0 	0 	1 	1 	1
0 	0 	0 	0 	1 	0 	0 	1 	1 	1

�Է�
�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����. 
�� ���� �ٺ��� ������ �׽�Ʈ ���̽��� ���� ù° �ٿ��� ���߸� ���� ���߹��� ���α��� M(1 �� M �� 50)�� ���α��� N(1 �� N �� 50), 
�׸��� ���߰� �ɾ��� �ִ� ��ġ�� ���� K(1 �� K �� 2500)�� �־�����. 
�� ���� K�ٿ��� ������ ��ġ X(0 �� X �� M-1), Y(0 �� Y �� N-1)�� �־�����. �� ������ ��ġ�� ���� ���� ����.

���
�� �׽�Ʈ ���̽��� ���� �ʿ��� �ּ��� ������������ ���� ���� ����Ѵ�.

�Է¿���1
2
10 8 17
0 0
1 0
1 1
4 2
4 3
4 5
2 4
3 4
7 4
8 4
9 4
7 5
8 5
9 5
7 6
8 6
9 6
10 10 1
5 5

��¿���1
5
1

�Է¿���2
1
5 3 6
0 2
1 2
2 2
3 2
4 2
4 0

��¿���
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CabbageBugs {

	static int[][] cabb;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int[] answers = new int[repeat];
		for(int rep = 0 ; rep < repeat ; rep++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xlength = Integer.parseInt(st.nextToken());
			int ylength = Integer.parseInt(st.nextToken());
			int cabages = Integer.parseInt(st.nextToken());
			cabb = new int[xlength][ylength];
			//�� �� �ʱ�ȭ
			for(int i = 0 ; i < xlength ; i++) {
				Arrays.fill(cabb[i], 0);
			}
			//���� ��ǥ �Է�
			for(int i = 0 ; i < cabages ; i++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				cabb[cx][cy] = 1;
			}
			int result = getBugnum();
			answers[rep] = result;
		}
		for(int i = 0 ; i < answers.length ; i++) {
			System.out.println(answers[i]);
		}

	}

	private static int getBugnum() {
		int result = 0;
		for(int i = 0 ; i < cabb.length ; i++) {
			for(int j = 0 ; j < cabb[i].length; j++) {
				//�����̸� ���ƾ� �Ѵٰ� ��ȯ�Ұ��, ������ ���� �ø���.
				if(setBug(i,j)) result += 1;
			}
		}
		return result;
	}

	//DFS�� �ذ�����.
	private static boolean setBug(int i, int j) {
		boolean setable = false;
		if(i >= 0 && i < cabb.length && j >= 0 && j < cabb[0].length) {
			if(cabb[i][j] == 1) {//���߰� �������
				//���ƾ� �Ѵٰ� ǥ��
				setable = true;
				cabb[i][j] = 0;	//���°����� ������
				//������ ��� ���ߵ� üũ�Ѵ�.
				for(int r = 0 ; r < dx.length ; r++) {
					int x = i+dx[r];
					int y = j+dy[r];
					setBug(x,y);
				}
			}
		}
		return setable;
	}

}
