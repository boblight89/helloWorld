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
		//sort를 넣어보았다. 하는일은 주석된 부분과 같다.
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
문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.
*/
/*
풀이: 3개의 x좌표와 y좌표가 주어졌을때, 직사각형을 만드려면 x는 두개가 같고, y도 두개가 같아야 한다.
3개중 같지않은 숫자를 표시하면 되겠다.
*/