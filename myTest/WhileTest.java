package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WhileTest {

	public static void main(String[] args) throws IOException {

		//prob10951();
		//prob10952();
		prob1110();
		
	}

	private static void prob1110() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int orig = Integer.parseInt(br.readLine());
		int comp = orig;
		int count = 0;
		while(orig != comp || count == 0 ) {			
			count++;
			int a = comp / 10;
			int b = comp % 10;
			int c = a + b;
			comp = (b*10) + (c%10);
		}
		System.out.println(count);
		br.close();	
		
	}

	private static void prob10952() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		while(a != 0 && b != 0) {			
			System.out.println(a+b);
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
		}
		br.close();		
		
	}

	private static void prob10951() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}
		br.close();		
	}

}
/*
���� - 1110
0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�.
���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�.
�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�.

���� ���� ����.
26���� �����Ѵ�. 2+6 = 8�̴�.
���ο� ���� 68�̴�. 6+8 = 14�̴�.
���ο� ���� 84�̴�. 8+4 = 12�̴�.
���ο� ���� 42�̴�. 4+2 = 6�̴�.
���ο� ���� 26�̴�.

���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.

���
ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.

--------------------------------------------------------------------

���� - 10951
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

---------------------------------------------------------------------

���� - 10952
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
�Է��� ���������� 0 �� ���� ���´�.

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

*/
