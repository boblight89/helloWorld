package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IfTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		p1330(br);
		p9498(br);
		p2753(br);
		p1468(br);
		p2884(br);
		
	}

	private static void p2884(BufferedReader br) throws IOException {
		//2884:�˶��ð�
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		if(min < 45) {
			min += 60;
			if(hour == 0) hour = 23;
			else hour -= 1;
		}
		min -= 45;
		System.out.println(hour +" "+min);		
	}

	private static void p1468(BufferedReader br) throws NumberFormatException, IOException {
		//1468: ��и�
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		if(x > 0) {
			if(y > 0) System.out.println("1");
			else System.out.println("4");
		}else {
			if(y > 0) System.out.println("2");
			else System.out.println("3");
		}
		
	}

	private static void p2753(BufferedReader br) throws NumberFormatException, IOException {
		//2753: ����
		int year = Integer.parseInt(br.readLine());
		if(year % 400 == 0) System.out.println("1");
		else if(year % 4 == 0) {
			if(year % 100 == 0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}else System.out.println("0");
		
	}

	private static void p9498(BufferedReader br) throws NumberFormatException, IOException {
		//9498: �������
		int score = Integer.parseInt(br.readLine());
		if(score >= 90) System.out.println("A");
		else if(score >= 80) System.out.println("B");
		else if(score >= 70) System.out.println("C");
		else if(score >= 60) System.out.println("D");
		else System.out.println("F");
		
	}

	private static void p1330(BufferedReader br) throws IOException {
		//1330: �� �� ���ϱ�
		StringTokenizer st = new StringTokenizer(br.readLine());
		int left = Integer.parseInt(st.nextToken());
		int right = Integer.parseInt(st.nextToken());
		if(left > right) System.out.println(">");
		else if(left < right) System.out.println("<");
		else System.out.println("==");
		
	}

}
/*
1330 ����
�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.

���
ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
    A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
    A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
    A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.

����
-10,000 �� A, B �� 10,000
*/
/*
9498 ����
���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
���� ������ ����Ѵ�.
*/
/*
���� 2753
������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�.
1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.

�Է�
ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
*/
/*
���� 1468
���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�.
��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. "Quadrant n"�� "��n��и�"�̶�� ���̴�.

���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�.
�� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.

���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.

�Է�
ù �ٿ��� ���� x�� �־�����. (-1000 <= x <= 1000, x != 0) �����ٿ��� ���� y�� �־�����. (-1000 <= y <= 1000, y != 0)

���
�� (x, y)�� ��и� ��ȣ(1, 2, 3, 4 �� �ϳ�)�� ����Ѵ�.
*/
/*
���� 2884
����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����,
�׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
�̷� ����̸� �ҽ��ϰ� ����, â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
�ٷ� "45�� ���� �˶� �����ϱ�"�̴�.
�� ����� �ܼ��ϴ�. ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�.
�� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ���� H�� M�� �־�����. (0 <= H <= 23, 0 <= M <= 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�.
�ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.

���
ù° �ٿ� ����̰� â������ ����� ����� ��, �����ؾ� �ϴ� �˶� �ð��� ����Ѵ�. (�Է°� ���� ���·� ����ϸ� �ȴ�.)
*/