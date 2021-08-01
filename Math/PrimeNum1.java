package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum1 {

	private static boolean isPrime(int num) {
		boolean result = true;
		if(num < 2) result = false;
		else if(num <= 3) result =  true;
		else {
			for(int i = 2; i < num/2 + 1 ; i++) {
				if(num % i == 0) {
					result = false;
					break;
				}
			}
		}		
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(isPrime(num)) result += 1;
		}
		System.out.println(result);

	}

}
/*
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

입력예제
4
1 3 5 7

출력예제
3
*/
