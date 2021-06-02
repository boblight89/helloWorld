package test.math;

import java.util.Scanner;

public class Honeycomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		int loop = 0;
		int comp = 0;
		while(true) {
			if(loop == 0) {
				comp = 1;
			}else {
				comp = comp + (loop*6);
			}
			loop++;
			if(comp >= n) break;
		}
		System.out.println(loop);
	}
}

/*
 벌집 문제
 1부터 육각형으로 숫자가 순서대로 커진다.
 입력한 숫자는 중앙으로부터 몇칸에 위치해 있는지 출력하는 클래스
 
 입력예시	출력예시
 13		3
 */
