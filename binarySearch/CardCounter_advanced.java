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
		Arrays.sort(cards); 	//이진탐색을 위한 정렬
		
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

	private static int searchLow(int target) {	//가장 작은 목표 숫자 배열	
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
	private static int searchHigh(int target) {	//가장 작은 목표숫자보다 큰 배열
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
 개선된 CardCounter - 이진탐색 중 IF문을 최대한 줄일수 있었다.
 System.out.print 보다 BufferedWriter를 사용하는게 시간상 이득이다. 기억하자.
 */
/*
문제
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

입력예시
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

출력예시
3 0 0 1 2 0 0 2
*/
