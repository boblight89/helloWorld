package test.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Areas {
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	
	int[][] board;	//땅
	int[] area;		//각 부지 넓이
	int count;		//부지 수
	
	public Areas(int[][] floor, int n) {
		board = floor;
		area = new int[n*((n/2)+1)];	// 1010101 식으로 들어온 최악의 상태를 상정
		count = 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[][] floor = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(br.readLine());
			char[] ch = st.nextToken().toCharArray();
			for(int j = 0 ; j < n ; j++) {
				floor[i][j] = ch[j]-'0';
			}
		}
		
		Areas ac = new Areas(floor,n);
		
		ac.getArea();
				
		System.out.println(ac.count);
		
		ac.sortLimit();
		for(int i = 0 ; i < ac.count ; i++) {
			System.out.println(ac.area[i]);
		}
	}

	private void sortLimit() {
		for(int i = 0 ; i < count ; i ++) {
			for(int j = i ; j < count ; j++) {
				if(area[i] > area[j]) {
					int temp = area[i];
					area[i] = area[j];
					area[j] = temp;
				}
			}
		}
		
	}

	private void getArea() {
		for(int i = 0; i< board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				if(board[i][j] == 1) {
					area[count] = dfs(i,j);
					count++;
				}
			}
		}
	}

	private int dfs(int x, int y) {
		if(x >= 0 && y >= 0 && x < board.length && y < board.length) {
			if(board[x][y] == 1) {
				int subarea = 1;
				board[x][y] = 0;
				for(int  i = 0 ; i < dx.length ; i++) {
					subarea += dfs(x+dx[i],y+dy[i]);
				}
				return subarea;
			}else {
				return 0;
			}
		}else {
			return 0;
		}
	}
}
/*
정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.

입력
첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고,
그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
출력 
첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오

입력예제		출력예제
7			3
0110100		7
0110101		8
1110101		9
0000111
0100000
0111110
0111000

*/