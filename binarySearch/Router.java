package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Router {
	
	static int routerNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int houseNum = Integer.parseInt(st.nextToken());
		routerNum = Integer.parseInt(st.nextToken());
		
		int[] house = new int[houseNum];
		
		for(int i = 0 ; i < houseNum ; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(house);
		
		int result = getMaxDistace(house);
		System.out.println(result);
		
	}
	
	static int getMaxDistace(int[] house) {
		int result = 0;
		int start = 1;								//�ּҰŸ�
		int end = house[house.length-1] - house[0];	//�� ���� �ִ� �Ÿ�
		
		while(start <= end) {
			int mid = (start+end)/2;
			int setpoint = house[0];
			int counter = 1;
			for(int i = 1; i< house.length; i++) {
				if(house[i] - setpoint >= mid) {
					setpoint = house[i];
					counter++;
				}
			}
			if(counter >= routerNum) {
				start = mid+1;
				if(result < mid) result = mid;
			}else {
				end = mid-1;
			}
		}
		return result;
	}
}

/*
����

�������� �� N���� ������ ���� �ִ�. ������ ���� ��ǥ�� x1, ..., xN�̰�, �� �������� ���� ��ǥ�� ������ ���� ����.

�����̴� ���� ��𼭳� �������̸� ���� ���ؼ� ���� ������ C���� ��ġ�Ϸ��� �Ѵ�.
�ִ��� ���� ������ �������̸� ����Ϸ��� �ϱ� ������, �� ������ �����⸦ �ϳ��� ��ġ�� �� �ְ�,
���� ������ �� ������ ������ �Ÿ��� ������ ũ�� �Ͽ� ��ġ�Ϸ��� �Ѵ�.

C���� �����⸦ N���� ���� ������ ��ġ�ؼ�, ���� ������ �� ������ ������ �Ÿ��� �ִ�� �ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ���� N (2 �� N �� 200,000)�� �������� ���� C (2 �� C �� N)�� �ϳ� �̻��� �� ĭ�� ���̿� �ΰ� �־�����.
��° �ٺ��� N���� �ٿ��� ���� ��ǥ�� ��Ÿ���� xi (0 �� xi �� 1,000,000,000)�� �� �ٿ� �ϳ��� �־�����.

���
ù° �ٿ� ���� ������ �� ������ ������ �ִ� �Ÿ��� ����Ѵ�.

�Է� ����
5 3
1
2
8
4
9

���� ���
3

*/