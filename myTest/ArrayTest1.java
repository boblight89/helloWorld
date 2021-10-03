package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayTest1 {

	public static void main(String[] args) throws IOException {
		//prob10818();
		//prob2562();
		//prob2577();
		prob3052();
	}

	private static void prob3052() throws IOException  {
		int[] arr = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] %= 42;
		}
		Arrays.sort(arr);
		int result = 1;
		for(int i = 1; i < arr.length ; i++) {
			if(arr[i-1] != arr[i]) {
				result += 1;
			}
		}
		System.out.println(result);
	}

	private static void prob2577() throws IOException {
		int[] arr = new int[10];
		Arrays.fill(arr, 0);
		int[] nums = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < 3 ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		for(int i = 1 ; i < 3 ; i++) {
			nums[0] *= nums[i];
		}
		char[] resultChar = String.valueOf(nums[0]).toCharArray();
		char ch0 = '0';
		for(int i = 0 ; i < resultChar.length ; i++) {
			int locArr = resultChar[i] - ch0;
			arr[locArr] += 1;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void prob2562() throws IOException {
		int[] arr = new int[9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1;
		int maxarr = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
				maxarr = i+1;
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(maxarr);
	}

	private static void prob10818() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int max = -1000001;
		int min = 1000001;
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		//�迭���� ���� �� Ȯ���Ҷ� �ִ� �ּ� ���Ҽ��� ������, �迭������ �迭�� ����غ���.
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.println(min + " "+ max);
		
		
	}

}
/*

���� - 3052
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

���
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.

�����Է�
39
40
41
42
43
44
82
83
84
85

�������
6

*/
/*
���� - 2577
�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.

�Է�
ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.

���
ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.

�����Է�
150
266
427

�������
3
1
0
2
0
0
0
2
0
0
*/

/*
���� - 2562
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, ���� �ٸ� 9���� �ڿ���
3, 29, 38, 12, 57, 74, 40, 85, 61
�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.

�Է�
ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.

�Է¿���
3
29
38
12
57
74
40
85
61

�������
85
8
*/

/*
���� - 10818
N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����.
��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

���
ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.

�����Է�
5
20 10 35 30 7

�������
7 35
*/

