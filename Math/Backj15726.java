package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj15726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		//��� ���� ���������� ��������, ������ �������� �������� �ʰ��ϱ� ���� �Ǽ������� �ް�, �����Ѵ�
		double result1 = a*b/c;
		result1 = Math.floor(result1);
		double result2 = a/b*c;
		result2 = Math.floor(result2);
		System.out.println(Math.max((int)result1,(int)result2));
		
	}

}
/*
����

������ ���� �� ���� �����ؼ� �־����� �� �� ���� ���� ��ȣ�� �� ���� ������ ��ȣ�� �̿��Ͽ� ���� �� �� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�� ���� ������ ������ �ʴ´�.)
32 �� 16 �� 8

�Է�
ù° �ٿ� �� �� ���� A, B, C(1 �� A, B, C �� 1,000,000)�� �־�����. ���� int������ ����� �ʴ´�.

���
���� �� �ִ� ���� ū ���� ����Ѵ�. ��, �Ҽ��� �Ʒ��� ������. 1e-9 ������ ������ ���� ����� �޶����� �Է��� �־����� �ʴ´�.

���� �Է� 1
32 16 8

���� ��� 1
64
*/
