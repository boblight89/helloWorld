package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bjoon9184_dynamic {

	static int[][][] mem;
	
	Bjoon9184_dynamic(){
		mem = new int[21][21][21];
		
		//초기화
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
			//값체크 - 모든 결과는 0~20 사이
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
문제
재귀 호출만 생각하면 신이 난다! 아닌가요?
다음과 같은 재귀함수 w(a, b, c)가 있다.

if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
    1
if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)
if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)

위의 함수를 구현하는 것은 매우 쉽다. 하지만, 그대로 구현하면 값을 구하는데 매우 오랜 시간이 걸린다. (예를 들면, a=15, b=15, c=15)
a, b, c가 주어졌을 때, w(a, b, c)를 출력하는 프로그램을 작성하시오.

입력
입력은 세 정수 a, b, c로 이루어져 있으며, 한 줄에 하나씩 주어진다. 입력의 마지막은 -1 -1 -1로 나타내며, 세 정수가 모두 -1인 경우는 입력의 마지막을 제외하면 없다.

출력
입력으로 주어진 각각의 a, b, c에 대해서, w(a, b, c)를 출력한다.

제한
    -50 ≤ a, b, c ≤ 50

예제입력
1 1 1
2 2 2
10 4 6
50 50 50
-1 7 18
-1 -1 -1

예제출력
w(1, 1, 1) = 2
w(2, 2, 2) = 4
w(10, 4, 6) = 523
w(50, 50, 50) = 1048576
w(-1, 7, 18) = 1

*/
