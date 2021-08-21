package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeSquare {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xmin = Math.min(x, w-x);
		int ymin = Math.min(y,h-y);
		System.out.println(Math.min(xmin, ymin));
	}
}
/*
����
�Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�. ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� x, y, w, h�� �־�����.

���
ù° �ٿ� ������ ������ ����Ѵ�.

����
    1 �� w, h �� 1,000
    1 �� x �� w-1
    1 �� y �� h-1
    x, y, w, h�� ����

�����Է�
6 2 10 3

�������
1
*/
/*
���簢�� �� ������ ���簢�� �ܰ����� ������ ���� ª���Ÿ� = �ش� ������ �ܰ������� ����,�������� ���� ª���Ÿ�
��� ��쿡�� �밢���� ����/���� ���̺��� ª���� ����.
*/