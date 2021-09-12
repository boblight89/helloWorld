package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForTest_1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//prob2739(br);
		//prob10950(br);
		//prob8393(br);
		//prob8393NotFor(br);
		prob15552(br);
		br.close();

	}

	private static void prob15552(BufferedReader br) throws IOException {
		int tcase = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0 ; i < tcase ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(a+b + "\n");
		}
		bw.flush();
		bw.close();		
	}

	private static void prob8393NotFor(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int result;
		if(n%2 == 0) {
			result = (n/2) * (1+n);
		}else {
			result = (n/2) * (1+n) + ((1+n)/2);
		}
		System.out.println(result);
	}

	private static void prob8393(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 1 ; i <= n; i++) {
			result+=i;
		}
		System.out.println(result);
	}

	private static void prob10950(BufferedReader br) throws IOException {
		int tcase = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < tcase ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}		
	}

	private static void prob2739(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(n + " * " + i + " = " + n*i );
		}		
	}
	
}
/*
���� - 2739
N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.

���
������İ� ���� N*1���� N*9���� ����Ѵ�.
-

���� - 10950
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
-

���� -8393
n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.

���
1���� n���� ���� ����Ѵ�.
-

���� - 15552
���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
C++�� ����ϰ� �ְ� cin/cout�� ����ϰ��� �Ѵٸ�, cin.tie(NULL)�� sync_with_stdio(false)�� �� �� ������ �ְ�, endl ��� ���๮��(\n)�� ����. ��, �̷��� �ϸ� �� �̻� scanf/printf/puts/getchar/putchar �� C�� ����� ����� ����ϸ� �� �ȴ�.
Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
Python�� ����ϰ� �ִٸ�, input ��� sys.stdin.readline�� ����� �� �ִ�. ��, �̶��� �� ���� ���๮�ڱ��� ���� �Է¹ޱ� ������ ���ڿ��� �����ϰ� ���� ��� .rstrip()�� �߰��� �� �ִ� ���� ����.
���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.
�ڼ��� ���� �� �ٸ� ����� ���� �� �ۿ� ����Ǿ� �ִ�.
�� ��α� �ۿ��� BOJ�� ��Ÿ ���� ���� ���� �� �� �ִ�.

�Է�
ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.

���
�� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.

*/