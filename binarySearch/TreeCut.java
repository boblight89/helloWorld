package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TreeCut {
	
	static int[] trees;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long norma = Integer.parseInt(st.nextToken());
		
		trees = new int[n];
		st = new StringTokenizer(br.readLine());
		br.close();
		
		int max = 0;
		for(int i = 0 ; i < n ; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			if(trees[i] > max) max = trees[i];
		}
		
		int result = treeCut(0,max,norma);
		System.out.println(result);
		
	}

	private static int treeCut(int start, int end, long norma) {
		int result = 0;
		while(start <= end) {
			long gain = 0;
			long mid = (start + end) / 2;
			//System.out.print("mid = "+ mid+"/");
			
			for(int i = 0 ; i < trees.length ; i++) {
				long left = trees[i] - mid;
				if(left > 0) gain += left;
			}
			//System.out.println("gain = "+gain);
			if(gain >= norma) {
				result = (int)mid;	//�ڸ��� ���� int���� �����ʴ´�
				start = (int)mid +1;
			}else {
				end = (int)mid-1;
			}
		}
		return result;
	}
}
/*
���ǻ��� : ���� ���̰� 2,000,000,000 �̹Ƿ�, int������ ������ �ִ�.
left�� ��� ���� �ִ� 	2,000,000,000,000,000 => 
long �ִ밪�� 			9,223,372,036,854,775,807 �� �����ʴ´�. -> �񱳰��� long�̾�� �Ѵ�.
 */

/*
����

����̴� ���� M���Ͱ� �ʿ��ϴ�. ��ó�� ������ ������ ���� ��� ���ع��ȱ� ������, ���ο� ���� �㰡�� ��û�ߴ�.
���δ� ����̳� �� ��ó�� ���� �� �ٿ� ���� ���� �㰡�� ���־���, ����̴� ���� ������ �������ܱ⸦ �̿��ؼ� ������ ���Ұ��̴�.
�������ܱ�� ������ ���� �����Ѵ�. ����, ����̴� ���ܱ⿡ ���� H�� �����ؾ� �Ѵ�.
���̸� �����ϸ� �鳯�� �����κ��� H���� ���� �ö󰣴�. �� ����, �� �ٿ� �������ִ� ������ ��� �����ع�����.
����, ���̰� H���� ū ������ H ���� �κ��� �߸� ���̰�, ���� ������ �߸��� ���� ���̴�.
���� ���, �� �ٿ� �������ִ� ������ ���̰� 20, 15, 10, 17�̶�� ����. ����̰� ���̸� 15�� �����ߴٸ�,
������ �ڸ� ���� ���̴� 15, 15, 10, 15�� �� ���̰�, ����̴� ���̰� 5�� ������ 2�� ������ ��� ���� �� ���̴�.
(�� 7���͸� ���� ��� ����) ���ܱ⿡ ������ �� �ִ� ���̴� ���� ���� �Ǵ� 0�̴�.

����̴� ȯ�濡 �ſ� ������ ���� ������, ������ �ʿ��� ��ŭ�� ������ ���������� �Ѵ�.
�̶�, ��� M������ ������ ���� �������� ���ؼ� ���ܱ⿡ ������ �� �ִ� ������ �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ �� N�� ����̰� ������ ���������� �ϴ� ������ ���� M�� �־�����. (1 �� N �� 1,000,000, 1 �� M �� 2,000,000,000)
��° �ٿ��� ������ ���̰� �־�����. ������ ������ ���� �׻� M���� ũ�ų� ���� ������, ����̴� ���� �ʿ��� ������ �׻� ������ �� �ִ�.
���̴� 1,000,000,000���� �۰ų� ���� ���� ���� �Ǵ� 0�̴�.

���
��� M������ ������ ���� �������� ���ؼ� ���ܱ⿡ ������ �� �ִ� ������ �ִ��� ����Ѵ�.

�Է¿�1
4 7
20 15 10 17

��¿�1
15

�Է¿�2
5 20
4 42 40 26 46

��¿�2
36
*/