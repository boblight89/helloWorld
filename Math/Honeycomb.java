package test.math;

import java.util.Scanner;

public class Honeycomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		int loop = 0;
		int comp = 0;
		while(true) {
			if(loop == 0) {
				comp = 1;
			}else {
				comp = comp + (loop*6);
			}
			loop++;
			if(comp >= n) break;
		}
		System.out.println(loop);
	}
}

/*
 ���� ����
 1���� ���������� ���ڰ� ������� Ŀ����.
 �Է��� ���ڴ� �߾����κ��� ��ĭ�� ��ġ�� �ִ��� ����ϴ� Ŭ����
 
 �Է¿���	��¿���
 13		3
 */
