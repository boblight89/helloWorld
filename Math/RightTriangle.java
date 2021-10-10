package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] length = new int[3];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = 0;
			int max = -1;
			int maxlen = -1;
			for(int i = 0 ; i < 3 ; i++) {
				length[i] = Integer.parseInt(st.nextToken());
				if(length[i] == 0) count++;
				else if(max < length[i]) {
					max = length[i];
					maxlen = i;
				}
			}
			if(count >= 3) break;
			else {
				long large = 0;
				long comp = 0;
				for(int i = 0 ; i < 3 ; i++) {
					if(i == maxlen) {
						large += length[i]*length[i];
					}else {
						comp += length[i]*length[i];
					}
				}
				if(large == comp) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		}		
	}
}
/*
���� - 4153(���� �ﰢ��)
���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.

�Է�
�Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�.
�� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������ �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�.

���
�� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ����Ѵ�.

���� �Է�
6 8 10
25 52 60
5 12 13
0 0 0

���� ���
right
wrong
right

*/