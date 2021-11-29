package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backj5532 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());		int d = Integer.parseInt(br.readLine());
		br.close();
		int maxKor = (int) Math.ceil((double)a/(double)c);
		int maxMath = (int) Math.ceil((double)b/(double)d);
		int estiDay = Math.max(maxKor, maxMath);
		
		System.out.println(l-estiDay);
		
	}

}
/*
����

����̴� �ʵ��б��� �ٴ� ��, ���� ������ ���麸�� ���� �̸� �ϰ� ���� �Ⱓ�� ��Ҵ�. ���� ������ ���а� ���� ���� Ǯ���̴�.

������ �� L���̴�. ������ �� B������, ����� �� A�������� Ǯ��� �Ѵ�. ����̴� �Ϸ翡 ��� �ִ� C������, ������ �ִ� D������ Ǯ �� �ִ�.

����̰� �ܿ� ���е��� ������ ���� �ʰ� �� �� �ִ� �ִ� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�

�� �ٿ� �ϳ��� �� �ټ� �ٿ� ���� L, A, B, C, D�� �־�����. (2 �� L �� 40, 1 �� A, B �� 1000, 1 �� C, D �� 100)

�׻� ���� ������ ���� �Ⱓ���� �� �� �� �ִ� ��츸 �Է����� �־�����.
���

ù° �ٿ� ����̰� �� �� �ִ� ���� �ִ��� ����Ѵ�.

���� �Է� 1
20
25
30
6
8

���� ��� 1
15

*/
/*
���� �������� �� ���� �������� �� ���� ���� �������ڿ� ���� �ȴ�.
�̶�, �������ڴ� Ǯ��� �ϴ� ������/�Ϸ� Ǯ���ִ������� �� �ø�ó�� �ؾ��Ѵ�.
*/