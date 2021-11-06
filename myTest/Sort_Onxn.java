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

문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
5
5
2
3
4
1

예제 출력 1
1
2
3
4
5*/