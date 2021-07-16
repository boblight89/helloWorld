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
		//주의 : 각 숫자는 붙어서 입력된다.
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

N×M크기의 배열로 표현되는 미로가 있다.
1 	0 	1 	1 	1 	1
1 	0 	1 	0 	1 	0
1 	0 	1 	0 	1 	1
1 	1 	1 	0 	1 	1

미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다.
이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오.
한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.

위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.

입력
첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 
다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.

출력
첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.

예제입력 1
4 6
101111
101010
101011
111011

예제출력 1
15

예제입력 2
4 6
110110
110110
111111
111101

예제출력 2
9

예제입력 3
2 25
1011101110111011101110111
1110111011101110111011101

예제출력 3
38

예제입력 4
7 7
1011111
1110001
1000001
1000001
1000001
1000001
1111111

예제출력 4
13

*/