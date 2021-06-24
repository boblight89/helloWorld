package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CardCounter {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cardNum = Integer.parseInt(bf.readLine());
		int[] cards = new int[cardNum];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i < cardNum ; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cards); 	//����Ž���� ���� ����
		
		int searchNum = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i < searchNum ; i++) {
			int target = Integer.parseInt(st.nextToken());
			int result = printCount(target,cards);
			System.out.print(result + " ");
		}

	}

	private static int printCount(int target, int[] cards) {
		int targetStart = -1;		
		int targetEnd = -1;
		
		int start = 0;
		int end = cards.length-1;
		startLoop:
		while(start <= end) {
			int mid = (start+end)/2;
			if(cards[mid] == target) {
				if(mid == 0 || cards[mid-1] < target) {
					targetStart = mid;
					break startLoop;
				}else {
					end = mid -1;
				}
			}else if(cards[mid] > target){
				end = mid -1;
			}else {
				start = mid+1;
			}
		}
		
		if(targetStart == -1) return 0;
		else {
			start = 0;
			end = cards.length-1;
			endLoop:
			while(start <= end) {
				int mid = (start+end)/2;
				if(cards[mid] == target) {
					if(mid == cards.length-1 || cards[mid+1] > target) {
						targetEnd = mid;
						break endLoop;
					}else {
						start = mid+1;
					}
				}else if(cards[mid] > target){
					end = mid -1;
				}else {
					start = mid+1;
				}
			}
		}
		return targetEnd - (targetStart -1);
	}

}
//������ �´µ�, ���ѽð� 1�ʸ� �Ѱܹ��ȴ�. �� ������ �� ����� ã�ƺ���...
/*
����
���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. ����̴� ���� ī�� N���� ������ �ִ�. ���� M���� �־����� ��, �� ���� �����ִ� ���� ī�带 ����̰� �� �� ������ �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����̰� ������ �ִ� ���� ī���� ���� N(1 �� N �� 500,000)�� �־�����.
��° �ٿ��� ���� ī�忡 �����ִ� ������ �־�����. ���� ī�忡 �����ִ� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.
��° �ٿ��� M(1 �� M �� 500,000)�� �־�����.
��° �ٿ��� ����̰� �� �� ������ �ִ� ���� ī������ ���ؾ� �� M���� ������ �־�����, �� ���� �������� ���еǾ��� �ִ�. �� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.

���
ù° �ٿ� �Է����� �־��� M���� ���� ���ؼ�, �� ���� ���� ���� ī�带 ����̰� �� �� ������ �ִ����� �������� ������ ����Ѵ�.

�Է¿���
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

��¿���
3 0 0 1 2 0 0 2
*/
