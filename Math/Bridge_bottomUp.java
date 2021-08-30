package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge_bottomUp {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[][] memory = new int[30][30];
		for(int i = 0 ; i < 30 ; i++) {
			memory[i][i] = 1;
			memory[i][0] = 1;
		}
		for(int i = 2; i < 30 ; i++) {
			for(int j = 1; j < 30 ; j++) {
				memory[i][j] = memory[i-1][j-1] + memory[i-1][j];
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(memory[m][n]);
		}
		
		br.close();
	}		
}
/*
����
����̴� �� ������ ������ �Ǿ���. �� ���ÿ��� ���ø� ���ʰ� �������� ������ ū ������ ����� ���� �帣�� �ִ�.
������ ����̴� �ٸ��� ��� �ùε��� ���� �ǳʴµ� ū ������ �ް� ������ �˰� �ٸ��� ����� ����Ͽ���.
�� �ֺ����� �ٸ��� ���⿡ ������ ���� ����Ʈ��� �Ѵ�.
����̴� �� �ֺ��� ����� ������ �� ��� ���� ���ʿ��� N���� ����Ʈ�� �ְ� ���ʿ��� M���� ����Ʈ�� �ִٴ� ���� �˾Ҵ�. (N �� M)
����̴� ������ ����Ʈ�� ������ ����Ʈ�� �ٸ��� �����Ϸ��� �Ѵ�. (�̶� �� ����Ʈ���� �ִ� �� ���� �ٸ��� ����� �� �ִ�.)
����̴� �ٸ��� �ִ��� ���� �������� �ϱ� ������ ������ ����Ʈ ������ŭ (N��) �ٸ��� �������� �Ѵ�.
�ٸ������� ���� ������ �� ���ٰ� �� �� �ٸ��� ���� �� �ִ� ����� ���� ���ϴ� ���α׷��� �ۼ��϶�.

�Է�
�Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� ���� �ٺ��� ������ �׽�Ʈ���̽��� ���� ���� ���ʰ� ���ʿ� �ִ� ����Ʈ�� ���� ���� N, M (0 < N �� M < 30)�� �־�����.

���
�� �׽�Ʈ ���̽��� ���� �־��� �����Ͽ� �ٸ��� ���� �� �ִ� ����� ���� ����Ѵ�.

�����Է�
3
2 2
1 5
13 29

�������
1
5
67863915

*/
/*
������ ���� ����� �����̳�, ������ ���⿡�� 0.5�ʸ� �ʰ��Ѵ�
�޸𸮴� �˳��ϴ�, ���̳��� ���α׷����� �̿��Ѵ�. - ���Ҿ� ���
 */