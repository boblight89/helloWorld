package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj15726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		//모든 수가 정수형으로 들어오지만, 연산중 나머지가 버려지지 않게하기 위해 실수형으로 받고, 연산한다
		double result1 = a*b/c;
		result1 = Math.floor(result1);
		double result2 = a/b*c;
		result2 = Math.floor(result2);
		System.out.println(Math.max((int)result1,(int)result2));
		
	}

}
/*
문제

다음과 같이 세 수가 연속해서 주어졌을 때 한 번의 곱셈 기호와 한 번의 나눗셈 기호를 이용하여 만든 식 중 가장 큰 값을 출력하는 프로그램을 작성하시오. (세 수의 순서는 변하지 않는다.)
32 ㅁ 16 ㅁ 8

입력
첫째 줄에 세 개 정수 A, B, C(1 ≤ A, B, C ≤ 1,000,000)가 주어진다. 답은 int범위를 벗어나지 않는다.

출력
나올 수 있는 가장 큰 값을 출력한다. 단, 소수점 아래는 버린다. 1e-9 이하의 오차로 인해 출력이 달라지는 입력은 주어지지 않는다.

예제 입력 1
32 16 8

예제 출력 1
64
*/
