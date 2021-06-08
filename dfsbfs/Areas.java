package test.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Areas {
	
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	
	int[][] board;	//��
	int[] area;		//�� ���� ����
	int count;		//���� ��
	
	public Areas(int[][] floor, int n) {
		board = floor;
		area = new int[n*((n/2)+1)];	// 1010101 ������ ���� �־��� ���¸� ����
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
���簢�� ����� ������ �ִ�. 1�� ���� �ִ� ����, 0�� ���� ���� ���� ��Ÿ����. ö���� �� ������ ������ ����� ���� ������ ������ �����ϰ�, ������ ��ȣ�� ���̷� �Ѵ�. ���⼭ ����Ǿ��ٴ� ���� � ���� �¿�, Ȥ�� �Ʒ����� �ٸ� ���� �ִ� ��츦 ���Ѵ�. �밢���� ���� �ִ� ���� ����� ���� �ƴϴ�. <�׸� 2>�� <�׸� 1>�� �������� ��ȣ�� ���� ���̴�. ������ �Է��Ͽ� �������� ����ϰ�, �� ������ ���ϴ� ���� ���� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù ��° �ٿ��� ������ ũ�� N(���簢���̹Ƿ� ���ο� ������ ũ��� ������ 5��N��25)�� �Էµǰ�,
�� ���� N�ٿ��� ���� N���� �ڷ�(0Ȥ�� 1)�� �Էµȴ�.
��� 
ù ��° �ٿ��� �� �������� ����Ͻÿ�. �׸��� �� ������ ���� ���� ������������ �����Ͽ� �� �ٿ� �ϳ��� ����Ͻÿ�

�Է¿���		��¿���
7			3
0110100		7
0110101		8
1110101		9
0000111
0100000
0111110
0111000

*/