package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EratosthenesSieve {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		//마지막 수 까지 소수여부 배열
		boolean[] isPrime = new boolean[end+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;	//0과 1은 소수가 아니다.
		
		//에라토스테네스의 체
		for(int i = 2; (i*i) <= end; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= end ;j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		//start 부터 end 까지 true 인 항목만 출력
		for(int i = start ; i <= end ; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
		
	}

}
/*
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

입력예
3 16

출력예
3
5
7
11
13
*/