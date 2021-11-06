package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_Onxn {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] sr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			sr[i] = Integer.parseInt(br.readLine());
		}
		
		//insertSort(sr);		
		bubbleSort(sr);

		for(int i = 0 ; i < n ; i++) {
			System.out.println(sr[i]);
		}
		
	}

	private static void bubbleSort(int[] sr) {
		int temp = 0;
		for(int i = 0; i < sr.length; i++) {       
			for(int j= 1 ; j < sr.length-i; j++) { 
				if(sr[j-1] > sr[j]) {
					temp = sr[j-1];
					sr[j-1] = sr[j];
					sr[j] = temp;
				}
			}
		}
		
	}

	private static void insertSort(int[] sr) {
		for(int i=1; i<sr.length; i++){
		    int key = sr[i];
		    int j;
		    for(j=i-1; j>=0 && sr[j]>key; j--){
		      sr[j+1] = sr[j];
		    }

		    sr[j+1] = key;
		  }		
	}

}
/*

����
N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� �־�����. �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.

���
ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.

���� �Է� 1
5
5
2
3
4
1

���� ��� 1
1
2
3
4
5*/