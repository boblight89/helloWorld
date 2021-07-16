package test.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MazeSearch {

	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	static class Position{
		int x;
		int y;
		
		Position(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		//���� : �� ���ڴ� �پ �Էµȴ�.
		int[][] map = new int[n][m];
		for(int i = 0 ; i < n ; i ++) {
			String sen = br.readLine();
			for(int j = 0 ; j < m ; j++) {
				char temp = sen.charAt(j);
				map[i][j] = temp - '0';
			}
		}
		
		Queue<Position> queue = new LinkedList<Position>();
		
		queue.add(new Position(0,0));
		while(!queue.isEmpty()) {
			Position curr = queue.poll();
			for(int i = 0 ; i < dx.length ; i++) {
				int cx = curr.x;
				int cy = curr.y;
				int mx = curr.x + dx[i];
				int my = curr.y + dy[i];
				if(mx >= 0 && mx < n && my >= 0 && my < m) {
					if(map[mx][my] == 1) {
						map[mx][my] = map[cx][cy] + 1;
						queue.add(new Position(mx,my));
					}
				}
			}
		}
		
		System.out.println(map[n-1][m-1]);
		br.close();
	}

}

/*

N��Mũ���� �迭�� ǥ���Ǵ� �̷ΰ� �ִ�.
1 	0 	1 	1 	1 	1
1 	0 	1 	0 	1 	0
1 	0 	1 	0 	1 	1
1 	1 	1 	0 	1 	1

�̷ο��� 1�� �̵��� �� �ִ� ĭ�� ��Ÿ����, 0�� �̵��� �� ���� ĭ�� ��Ÿ����.
�̷��� �̷ΰ� �־����� ��, (1, 1)���� ����Ͽ� (N, M)�� ��ġ�� �̵��� �� ������ �ϴ� �ּ��� ĭ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�� ĭ���� �ٸ� ĭ���� �̵��� ��, ���� ������ ĭ���θ� �̵��� �� �ִ�.

���� �������� 15ĭ�� ������ (N, M)�� ��ġ�� �̵��� �� �ִ�. ĭ�� �� ������ ���� ��ġ�� ���� ��ġ�� �����Ѵ�.

�Է�
ù° �ٿ� �� ���� N, M(2 �� N, M �� 100)�� �־�����. 
���� N���� �ٿ��� M���� ������ �̷ΰ� �־�����. ������ ������ �پ �Է����� �־�����.

���
ù° �ٿ� ������ �ϴ� �ּ��� ĭ ���� ����Ѵ�. �׻� ������ġ�� �̵��� �� �ִ� ��츸 �Է����� �־�����.

�����Է� 1
4 6
101111
101010
101011
111011

������� 1
15

�����Է� 2
4 6
110110
110110
111111
111101

������� 2
9

�����Է� 3
2 25
1011101110111011101110111
1110111011101110111011101

������� 3
38

�����Է� 4
7 7
1011111
1110001
1000001
1000001
1000001
1000001
1111111

������� 4
13

*/