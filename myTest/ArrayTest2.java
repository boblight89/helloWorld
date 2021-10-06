package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException {
		//prob1546();
		//prob8598();
		prob4344();
		
	}

	private static void prob4344() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int repeat = 0 ; repeat < n ; repeat++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int[] scores = new int[students];
			float average = 0;
			for(int i = 0 ; i < scores.length ; i++) {
				scores[i] = Integer.parseInt(st.nextToken());
				average += scores[i];
			}
			average /= students;
			float overavg = 0;
			for(int i = 0 ; i < scores.length ; i++) {
				if((float)scores[i] > average) overavg += 1;
			}
			overavg = (overavg/students)*100;
			System.out.printf("%.3f%%\n",overavg);
		}
		br.close();
	}

	private static void prob8598() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int repeat = 0 ; repeat < n ; repeat++) {
			String oxStr = br.readLine().toUpperCase();
			char[] ox = oxStr.toCharArray();
			int currScore = 0;
			int result = 0;
			for(int i = 0 ; i < ox.length ; i++) {
				if(ox[i] == 'O') {
					currScore += 1; 
				}else {
					currScore = 0;
				}
				result += currScore;
			}
			System.out.println(result);
		}
		br.close();
	}

	private static void prob1546() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] orig = new int[n];		//�� ����
		float[] cheat = new float[n];	//���� ����
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int max = 0; //��� �ϳ��� 0���� ũ�ٴ� ������ �ִ�. ������� 0 �����ϰ�� �����޽��� ���� ���� �߰��۾� �ʿ�
		for(int i = 0 ; i < n ; i++) {
			orig[i] = Integer.parseInt(st.nextToken());
			if(orig[i] > max) max = orig[i];
		}
		float result = 0;
		for(int i = 0 ; i < n ; i++) {
			cheat[i] = ((float)orig[i]/max)*100;
			result += cheat[i];
		}
		result = (result/n);
		System.out.println(result);
	}

}
/*
���� - 4344
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.

�����Է�
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

�������
40.000%
57.143%
33.333%
66.667%
55.556%
*/
/*
���� - 8598
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.

���
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

�����Է�
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

�������
10
9
7
55
30
*/

/*
���� - 1546
�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����.
�� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.

���
ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10^-2 �����̸� �����̴�.

�����Է�1
3
40 80 60

�������1
75.0
*/