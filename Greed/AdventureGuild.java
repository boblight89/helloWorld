package test;

import java.util.Arrays;
import java.util.Random;
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
		Random r = new Random();
		for(int i = 0 ; i < n ; i++) {
			f[i] = sc.nextInt();	//����
//			f[i] = r.nextInt(n+1);	//�ڵ�
		}
		sc.close();
		long bf;
		long af;
		int result;
		
		AdventureGuild ag = new AdventureGuild(f);
		
		for(int i = 0 ; i < ag.fear.length ; i++) {
			System.out.print(ag.fear[i] + " ");
			if(i > 20) break;
		}
		System.out.println("");
		bf = System.currentTimeMillis();
		result = ag.getMaxGroup();
		af = System.currentTimeMillis();
		System.out.println(result);
		System.out.println("time : "+(af - bf)+ "ms");
		
		bf = System.currentTimeMillis();
		result = ag.advancedGetMaxGroup();
		af = System.currentTimeMillis();
		System.out.println(result);
		System.out.println("time : "+(af - bf)+ "ms");
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
	
	private int advancedGetMaxGroup() {	//���� �������� ����� �ڵ�. �� ������ ���� ����Ѵ�.
		int result = 0;
		int count = 0;
		for(int i = 0; i < fear.length ; i++) {
			count+=1;
			if(fear[i] <= count) {
				result+=1;
				count = 0;
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