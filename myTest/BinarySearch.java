package test;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	int[] searchable;	//�˻��� ��
	int[] toSearch;		//�˻��� ��
	int[] result;		//�����: 1�̸� ����, 0�̸� ������
	
	BinarySearch(int[] searchable, int[] toSearch, int searchLength){
		this.searchable = searchable;
		this.toSearch = toSearch;
		result = new int[searchLength];
		Arrays.fill(result, 0);			//����� �ʱ�ȭ
		Arrays.sort(this.searchable); 	//����Ž���� ���ؼ� ������ �Ǿ�� �Ѵ�.
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
 ����Ž�� ���� - �ڿ��� ���հ�, ã�� �ڿ��� ������ �Է��ϰ�, ã�� �ڿ����� ����� 1, �ƴҽ� 0�� ����ϴ� ���α׷� ����
 ù° �ٿ� �ڿ��� N(1 �� N �� 100,000)�� �־�����. 
 ���� �ٿ��� N���� ���� A[1], A[2], ��, A[N]�� �־�����.
 ���� �ٿ��� M(1 �� M �� 100,000)�� �־�����.
 ���� �ٿ��� M���� ������ �־����µ�, �� ������ A�ȿ� �����ϴ��� �˾Ƴ��� �ȴ�.
 ��� ������ ������ -2^31 ���� ũ�ų� ���� 2^31���� �۴�
 */
