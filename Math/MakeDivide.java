package test.math;

import java.util.Scanner;

public class MakeDivide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		int x = 1;
		int y = 1;
		boolean xup = false;
		for(int i = 1 ; i< count ; i++) {
			if(xup) {
				if(y == 1) {
					xup = false;
					x++;
				}else {
					x++;
					y--;
				}
			}else {
				if(x == 1) {
					xup = true;
					y++;
				}else {
					y++;
					x--;
				}
			}
		}
		System.out.println(x+"/"+y);
	}
	
}
/*
 �м� ã��
 ������ ū �迭�� ������ ���� �м����� �����ִ�
 1/1 1/2 1/3 1/4 1/5 ....
 2/1 2/2 2/3 2/4 2/5 ....
 3/1 3/2 3/3 ....
 4/1 4/2 4/3 ....
 5/1 ...
 ...
 
 �̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
 X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */