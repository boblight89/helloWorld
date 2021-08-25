package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			//주의: 제곱근 은 근사치가 나와 오답을 낼수 있다.
			//double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
			//double small = Math.abs(r1-r2);
			//double big = r1+r2;
			double d = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
			double small = Math.pow(r1-r2,2);
			double big = Math.pow(r1+r2,2);
			System.out.println(small + " " + big + " " + d);
			
			if(d == 0) {
				if(r1 == r2) {
					System.out.println(-1);
				}else {
					System.out.println(0);
				}
			}else {
				if(d == big || d == small) {
					System.out.println(1);
				}else if(d > small && d < big) {
					System.out.println(2);
				}else {
					System.out.println(0);
				}
			}
			
		}
	}
}
/*
문제
조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다.
이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다.
조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.

조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고,
조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
한 줄에 x1, y1, r1, x2, y2, r2가 주어진다.
x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.

출력
각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.

입력예시
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5

출력예
2
1
0
*/
/*
터렛 이라 했지만, 두 원의 위치관계를 계산하는것.
두 점의 거리를 D 라 하고, r1, r2를 원의 반지름이라고 보았을때,
경우의 수는 두 점이 만나는 경우, 한 점이 만나는 경우, 만나지 않는경우, 일치하는 경우(무한)으로 볼수 있다.

한 점이 만나는 경우
D = r1 + r2
D = r1 - r2

두 점이 만나는 경우
r1 - r2 < D < r1 + r2

만나지 앟는 경우
D < r1 - r2
D > r1 + r2
D = 0 , r1 != r2

무한인 경우
D = 0 , r1 = r2
 */