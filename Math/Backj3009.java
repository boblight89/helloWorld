package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backj3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i = 0 ; i < 3 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());			
		}
		int nx; int ny;
		/*
		if(x[0] == x[1]) {
			nx = x[2];
		}else {
			if(x[1] == x[2]) {
				nx = x[0];
			}else nx = x[1];
		}
		if(y[0] == y[1]) {
			ny = y[2];
		}else {
			if(y[1] == y[2]) {
				ny = y[0];
			}else ny = y[1];
		}
		*/
		//sort�� �־�Ҵ�. �ϴ����� �ּ��� �κа� ����.
		Arrays.sort(x);
		Arrays.sort(y);
		if(x[0] == x[1]) {
			nx = x[2];
		}else nx = x[0];
		if(y[0] == y[1]) {
			ny = y[2];
		}else ny = y[0];
		System.out.println(nx + " " + ny);
	}

}
/*
����
�� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 1���� ũ�ų� ����, 1000���� �۰ų� ���� �����̴�.

���
���簢���� �� ��° ���� ��ǥ�� ����Ѵ�.
*/
/*
Ǯ��: 3���� x��ǥ�� y��ǥ�� �־�������, ���簢���� ������� x�� �ΰ��� ����, y�� �ΰ��� ���ƾ� �Ѵ�.
3���� �������� ���ڸ� ǥ���ϸ� �ǰڴ�.
*/