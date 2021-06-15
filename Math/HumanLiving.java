package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HumanLiving {
	
	int[][] human;
	
	HumanLiving(){
		human = new int[15][15];
		for(int i = 0 ; i < 15 ; i++) {
			Arrays.fill(human[i], 0);
		}
		for(int i = 0 ; i <= 14 ; i++) {
			for(int j = 1 ; j <= 14 ; j++) {
				if(i == 0 || j == 1) {
					human[i][j] = j;
				}else {
					human[i][j] = human[i-1][j] + human[i][j-1];
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//�� �ٿ� �ϳ��� �����Ƿ� ���� StringTokenizer�� �ʿ����.
		int n = Integer.parseInt(bf.readLine());
		
		HumanLiving building = new HumanLiving();
		
		for(int i = 0 ; i < n ; i++) {
			int floor = Integer.parseInt(bf.readLine());
			int room = Integer.parseInt(bf.readLine());
			System.out.println(building.human[floor][room]);
			
		}
	}
}
/*


��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
�� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.
����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�. ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.

�Է�
ù ��° �ٿ� Test case�� �� T�� �־�����. �׸��� ������ ���̽����� �Է����� ù ��° �ٿ� ���� k, �� ��° �ٿ� ���� n�� �־�����

���
������ Test case�� ���ؼ� �ش� ���� ���ֹ� ���� ����϶�.

���� �Է�		���� ���
2			6
1			10
3
2
3

* �̰� ���� �̶�⺸�� ���̳������α׷��� �ƴѰ�?
*/