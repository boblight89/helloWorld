package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForTest_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//prob2741(br);
		//prob2742(br);
		//prob11021(br);
		//prob11022(br);
		//prob2438(br);
		//prob2439(br);
		prob10871(br);
	}

	private static void prob2741(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n ; i++){
			System.out.println(i);
		}				
	}

	private static void prob2742(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = n  ; i > 0 ; i--){
			System.out.println(i);
		}				
	}

	private static void prob11021(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+ (a+b));
		}				
	}
	
	private static void prob11022(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+a+ " + "+ b +" = "+(a+b));
		}				
	}
	
	private static void prob2438(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	private static void prob2439(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++){
				if((n-1)-j > i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	
	private static void prob10871(BufferedReader br) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < test ; i++) {
			int comp = Integer.parseInt(st.nextToken());
			if(comp < n) System.out.print(comp + " ");
		}
	}
}
/*
���� - 2741
�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.

*/
/*
���� - 2742
�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
*/
/*
���� - 11021
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
*/
/*
���� 11022
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
*/
/*
���� - 2438
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
*/
/*
���� -2439
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
*/
/*
���� - 10871
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
*/