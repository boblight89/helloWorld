package binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CardCounter_advanced {

	static int[] cards;
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cardNum = Integer.parseInt(bf.readLine());
		cards = new int[cardNum];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i < cardNum ; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cards); 	//����Ž���� ���� ����
		
		int searchNum = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i < searchNum ; i++) {
			int target = Integer.parseInt(st.nextToken());
			int low = searchLow(target);
			int high = searchHigh(target);;
			bw.append((high - low) + " ");
		}
		
		bw.flush();
		bw.close();

	}

	private static int searchLow(int target) {	//���� ���� ��ǥ ���� �迭	
		int start = 0;	int end = cards.length-1;
		while(start < end) {
			int mid = (start+end)/2;
			if(cards[mid] >= target) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		return end;
	}
	private static int searchHigh(int target) {	//���� ���� ��ǥ���ں��� ū �迭
		int start = 0;	int end = cards.length-1;
		while(start < end) {
			int mid = (start+end)/2;
			if(cards[mid] > target) {
				end = mid;
			}else {
				start = mid+1;
			}
		}
		if(cards[end] == target) end++;
		return end;
	}

}
/*
 ������ CardCounter - ����Ž�� �� IF���� �ִ��� ���ϼ� �־���.
 System.out.print ���� BufferedWriter�� ����ϴ°� �ð��� �̵��̴�. �������.
 */
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
