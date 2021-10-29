package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bjoon9184_dynamic {

	static int[][][] mem;
	
	Bjoon9184_dynamic(){
		mem = new int[21][21][21];
		
		//�ʱ�ȭ
		for(int a = 0; a <= 20 ; a++) {
			for(int b = 0; b <= 20 ; b++) {
				for(int c = 0; c <= 20 ; c++) {
					func(a,b,c);
				}
			}
		}
	}
	
	private int func(int a, int b, int c) {
		if(a == 0 || b == 0 || c == 0) return mem[a][b][c] = 1;
		else if(mem[a][b][c] > 1) return mem[a][b][c];
		else if(a < b && b < c) {
			return mem[a][b][c] = func(a,b,c-1) + func(a,b-1,c-1) - func(a,b-1,c);
		}else {
			return mem[a][b][c] = func(a-1,b,c) + func(a-1,b-1,c) + func(a-1,b,c-1) - func(a-1,b-1,c-1);
		}
	}

	public static void main(String[] args) throws IOException {
		Bjoon9184_dynamic m = new Bjoon9184_dynamic();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		while(a != -1 || b != -1 || c != -1) {
			//��üũ - ��� ����� 0~20 ����
			int ta = a; int tb= b; int tc=c;
			if(a <= 0 || b <= 0 || c <= 0){a = 0 ; b = 0; c = 0;}
			if(a > 20 || b >20 || c>20){a = 20 ; b = 20; c = 20;}
			System.out.printf("w(%d, %d, %d) = %d\n",ta,tb,tc,m.func(a, b, c));
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());			
		}
	}

}
/*
����
��� ȣ�⸸ �����ϸ� ���� ����! �ƴѰ���?
������ ���� ����Լ� w(a, b, c)�� �ִ�.

if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
    1
if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)
if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)

���� �Լ��� �����ϴ� ���� �ſ� ����. ������, �״�� �����ϸ� ���� ���ϴµ� �ſ� ���� �ð��� �ɸ���. (���� ���, a=15, b=15, c=15)
a, b, c�� �־����� ��, w(a, b, c)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� �� ���� a, b, c�� �̷���� ������, �� �ٿ� �ϳ��� �־�����. �Է��� �������� -1 -1 -1�� ��Ÿ����, �� ������ ��� -1�� ���� �Է��� �������� �����ϸ� ����.

���
�Է����� �־��� ������ a, b, c�� ���ؼ�, w(a, b, c)�� ����Ѵ�.

����
    -50 �� a, b, c �� 50

�����Է�
1 1 1
2 2 2
10 4 6
50 50 50
-1 7 18
-1 -1 -1

�������
w(1, 1, 1) = 2
w(2, 2, 2) = 4
w(10, 4, 6) = 523
w(50, 50, 50) = 1048576
w(-1, 7, 18) = 1

*/
