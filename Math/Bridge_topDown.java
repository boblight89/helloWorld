package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge_topDown {
	
	static int[][] memory = new int[30][30];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		for(int i = 0 ; i < 30 ; i++) {
			memory[i][i] = 1;
			memory[i][0] = 1;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < test ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			System.out.println(combination(m,n));
		}
		
		br.close();
	}

	private static int combination(int m, int n) {
		if(memory[m][n] > 0) {
			return memory[m][n];
		}else {
			return memory[m][n] = combination(m-1,n-1) + combination(m-1,n);
		}
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
�޸𸮴� �˳��ϴ�, ���̳��� ���α׷����� �̿��Ѵ�. - ž�ٿ� ���
 */