package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj15964_Snailcalc {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long result = snailCalc(a,b);
		System.out.println(result);
	}

	private static long snailCalc(long a, long b) {
		long first = a+b;
		long last = a-b;
		return first*last;
	}
}
/*
����
�λ��ϰ��а���б��� ȿ���̴� ������ �����̴�. � ������ ���� 1�� ���� Ǯ������ٴ� �б��� ������ ������ �������µ�,
�̷� ŷ�Ѱ� ȿ�����Ե� ����� �����. ��κ��� �������� �ݺ��Ǵ� ������ �־��� �����̴�!
�� ������ �ʹ� �� ���̿� Ǯ�� ȿ���̴� �ʹ� ���뽺������, �ڽ��� ���� �����ڸ� ������ �ߴ�.

�������� ��ȣ�� ������, A��B = (A+B)��(A-B)���� ���ǳ������ �ߴ�.
������, ȿ���̴� ���� ū ���ڰ� ������ ����ϱ� �ʹ� ����������.
ȿ���̸� ���� ���� A, B�� �־����� A��B�� ����ϴ� ���α׷��� ���������!

�Է�
ù° �ٿ� A, B�� �־�����. (1 �� A, B �� 100,000)

���
 ù° �ٿ� A��B�� ����� ����Ѵ�.
 
�����½�ũ 1 (30��)
    A, B �� 1,000

�����½�ũ 2 (70��)
�������� �־��� ���� ���� �� ���� ����

���� �Է� 1
4 3

���� ��� 1
7

���� �Է� 2
3 4

���� ��� 2
-7

*/