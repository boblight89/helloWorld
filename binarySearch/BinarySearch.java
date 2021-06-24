package test;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	int[] searchable;	//검색용 수
	int[] toSearch;		//검색할 수
	int[] result;		//결과값: 1이면 존재, 0이면 미존재
	
	BinarySearch(int[] searchable, int[] toSearch, int searchLength){
		this.searchable = searchable;
		this.toSearch = toSearch;
		result = new int[searchLength];
		Arrays.fill(result, 0);			//결과값 초기화
		Arrays.sort(this.searchable); 	//이진탐색을 위해선 정렬이 되어야 한다.
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] se = new int[n];
		for(int i = 0; i< n ; i++) {
			se[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] ts = new int[m];
		for(int i = 0 ; i < m ; i++){
			ts[i] = sc.nextInt();
		}
		sc.close();
		
		BinarySearch bs = new BinarySearch(se,ts,m);
		
		for(int i = 0 ; i < bs.result.length ; i++) {
			bs.result[i] = bs.binarySearch(0,bs.searchable.length - 1, bs.toSearch[i]);
		}
		for(int i = 0 ; i < bs.result.length ; i++) {
			System.out.println(bs.result[i]);
		}

	}

	private int binarySearch(int start, int end, int target) {
		if(start > end) return 0;
		int mid = (start + end) / 2;
		if(searchable[mid] == target) return 1;
		else if(target > searchable[mid]) {
			return binarySearch(mid+1,end,target);
		}else {
			return binarySearch(start,mid-1,target);
		}
	}

}
/*
 이진탐색 예제 - 자연수 집합과, 찾을 자연수 집합을 입력하고, 찾는 자연수가 존재시 1, 아닐시 0을 출력하는 프로그램 제작
 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 
 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
 모든 정수의 범위는 -2^31 보다 크거나 같고 2^31보다 작다
 */
