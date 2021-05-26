package test;

import java.util.Arrays;
import java.util.Scanner;

public class AdventureGuild {

	int[] fear;
	
	AdventureGuild(int[] fear){
		this.fear = fear.clone();
		Arrays.sort(this.fear);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] f = new int[n];
		for(int i = 0 ; i < n ; i++) {
			f[i] = sc.nextInt();
		}
	
		AdventureGuild ag = new AdventureGuild(f);
		
		int result = ag.getMaxGroup();
		System.out.println(result);
	}

	private int getMaxGroup() {
		int result = 0;
		int require = 0;
		boolean isFirst = false;
		for(int i = 0; i < fear.length ; i++) {
			isFirst = false;	//�׷��� ù �ο��� ��� üũ
			if(require == 0) {	//�䱸�ڰ� ������� = ���� �ο����� ������ �������
				require = fear[i];	//�� ���谡�� ������ �� �ְ�
				isFirst = true;		//�׷� ù �ο� ǥ��
			}
			if(!isFirst && fear[i] > fear[i-1]) require += (fear[i] - fear[i-1]);
			//ù �ο��� �ƴϰ�, ���� ���谡���� �� ���谡�� �������� �������, �� ���谡�� �������� �䱸�ο��� ����
			require -= 1;	//�ο����� ����
			if(require == 0) {
				result += 1;
			}
		}
		return result;
	}

}
/*
 �׸��� ���빮��
 ���谡 ���
 N���� ���谡�� �ְ�, �� ���谡�� X��ŭ�� �������� ������ �ִ�.
 ���谡�� ������ ���ؼ� �������� X�� ���谡�� X�� �̻��� �׷��� �Ǿ�߸� ������ ������ �ִ�.
 �̶�, �Է¹��� ���谡�� �׷쿡�� ������ ������ �ִ� �׷��� �ִ���� ���ϴ� ���α׷�
 
 �Է�
 ù��: ���谡�� N ( 1 <= N < = 100000)
 ��°��: �� ���谡�� ������ X (1 <= X[i] < N)
 ���
 ���谡 �׷� �� 
 */