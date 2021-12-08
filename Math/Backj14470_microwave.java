package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backj14470_microwave {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());	//�ʱ� ��� �µ�
		int b = Integer.parseInt(br.readLine());	//��ǥ�µ�
		int c = Integer.parseInt(br.readLine());	//�� ��⸦ 1�ɵ���� �ð� 
		int d = Integer.parseInt(br.readLine());	//0���϶� �ص��ϴ½ð�
		int e = Integer.parseInt(br.readLine());	//���� ��⸦ 1�ɵ���� �ð�
		if(a < 0) {
			int result = d + b*e - a*c ; 
			System.out.println(result);
		}else {
			int result = (b-a)*e;
			System.out.println(result);
		}
	}
}
/*
����
JOI ���� �Ļ� �غ� ���� A���� ��⸦ ���ڷ������� B�ɱ��� ������� �Ѵ�. ���� �µ��� 0�ɺ��� ���� �� ��� �ְ�,
0�ɺ��� ���� ���� ��� ���� �ʴ�. �µ��� ��Ȯ�� 0���� �� ���� ��� ���� ����, ��� ���� ���� ���� �ִ�.

JOI ���� ������ �� ��Ⱑ �Ʒ��� ��Ģ�� ���� �������ٰ� �����ϰ�, ��⸦ ����� �� �ɸ��� �ð��� ��ϱ�� �ߴ�.

    ��Ⱑ ��� �ְ� �µ��� 0�� �̸��� �� : �µ��� C�ʿ� 1�ɾ� ������.
    ��Ⱑ ��� �ְ� �µ��� ��Ȯ�� 0���� �� : ��� ���� ���� ���·� �����(�ص��ϴ�) �� D�ʰ� �ɸ���.
    ��Ⱑ ��� ���� ���� �� : �µ��� E�ʿ� 1�ɾ� ������.

�� ��Ģ�� ����, ��Ⱑ B�ɱ��� �������� �� �� �ʰ� �ɸ����� ���϶�.

�Է�

�Է��� �� 5�ٷ�, �� �ٿ� �� ������ ������ �־�����.
    ù �ٿ��� ������ ����� �µ� A�� �־�����. ��, A�� -100 �̻� 100 �����̸�, 0�� �ƴϴ�.
    ��° �ٿ��� ��ǥ �µ� B�� �־�����. ��, B�� 1 �̻� 100 �����̸�, A���� ũ��.
    ��° �ٿ��� ��� �ִ� ��⸦ 1�� ����� �� �ɸ��� �ð� C�� �־�����.
    ��° �ٿ��� ��� �ִ� ��⸦ �ص��ϴ� �� �ɸ��� �ð� D�� �־�����.
    �ټ�° �ٿ��� ��� ���� ���� ��⸦ 1�� ����� �� �ɸ��� �ð� E�� �־�����.
C, D, E�� ��� 1 �̻� 100 �����̴�.

���
��⸦ B�ɷ� ����� �� �ɸ��� �ð��� �� ������ �� �ٿ� ����϶�.

���� �Է� 1
-10
20
5
10
3

���� ��� 1
120

*/