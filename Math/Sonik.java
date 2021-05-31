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
손익분기점 문제
A,B,C 를 입력받는다.
A는 고정비용, B는 1대당 생산비용, C는 판매비용일때
처음으로 이득이 발생하는 판매대수를 구한다.
이익이 발생하지 않으면 -1을 출력한다.
*/