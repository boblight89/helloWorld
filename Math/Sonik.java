package test;

import java.util.Scanner;

public class Sonik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int result = 0;
		if(b >= c) result = -1;
		else result = (a / (c - b))+1;
		System.out.println(result);
	}
}
/*
���ͺб��� ����
A,B,C �� �Է¹޴´�.
A�� �������, B�� 1��� ������, C�� �Ǹź���϶�
ó������ �̵��� �߻��ϴ� �ǸŴ���� ���Ѵ�.
������ �߻����� ������ -1�� ����Ѵ�.
*/