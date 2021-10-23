package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessBoard {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//ü���� ����
		char[][] board = new char[n][m];
		for(int i = 0 ; i < n ; i++) {
			String str = br.readLine();
			char[] cstr = str.toCharArray();
			for(int j = 0; j < m ; j++) {
				board[i][j] = cstr[j];
			}
		}
		int result = 99999;
		char[] check = {'B','W'};
		for(int a = 0 ; a <= n-8 ; a++) {
			for(int b = 0 ; b <= m-8 ; b++) {
				for(int c = 0 ; c < 2 ; c++) {
					int mid = 0;
					for(int d = 0 ; d < 8 ; d ++) {
						for(int e = 0 ; e < 8 ; e++) {
							if(board[a+d][b+e] != check[(d+e+c)%2]) mid += 1;
						}
					}
					if(result > mid) result =mid;
				}
			}
		}
		System.out.println(result);
	}
}

/*
����

�����̴� �ڽ��� ���ÿ��� MN���� ���� ���簢������ �������� �ִ� M��N ũ���� ���带 ã�Ҵ�. � ���簢���� ���������� ĥ���� �ְ�, �������� ������� ĥ���� �ִ�. �����̴� �� ���带 �߶� 8��8 ũ���� ü�������� ������� �Ѵ�.
ü������ �������� ����� �����Ƽ� ĥ���� �־�� �Ѵ�. ��ü������, �� ĭ�� �������� ��� �� �ϳ��� ��ĥ�Ǿ� �ְ�, ���� �����ϴ� �� ���� �簢���� �ٸ� ������ ĥ���� �־�� �Ѵ�. ���� �� ���Ǹ� ������ ü������ ��ĥ�ϴ� ���� �� �������̴�. �ϳ��� �� ���� �� ĭ�� ����� ���, �ϳ��� �������� ����̴�.
���尡 ü����ó�� ĥ���� �ִٴ� ������ ���, �����̴� 8��8 ũ���� ü�������� �߶� �Ŀ� �� ���� ���簢���� �ٽ� ĥ�ؾ߰ڴٰ� �����ߴ�. �翬�� 8*8 ũ��� �ƹ������� ��� �ȴ�. �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢���� �ּ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� M�� �־�����. N�� M�� 8���� ũ�ų� ����, 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ������ �� ���� ���°� �־�����. B�� �������̸�, W�� ����̴�.

���
ù° �ٿ� �����̰� �ٽ� ĥ�ؾ� �ϴ� ���簢�� ������ �ּڰ��� ����Ѵ�.

�����Է�
9 23
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBW

�������
31
*/
/*
 8*8ũ��� W�� ���� �����ϴ� ü���� / B�� ���� �����ϴ� ü���� �� ��� ����Ǽ��� �� �غ��� �ּҰ��� ����ϰ� �ߴ�.
 */
