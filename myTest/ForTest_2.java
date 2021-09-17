package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForTest_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//prob2741(br);
		//prob2742(br);
		//prob11021(br);
		//prob11022(br);
		//prob2438(br);
		//prob2439(br);
		prob10871(br);
	}

	private static void prob2741(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n ; i++){
			System.out.println(i);
		}				
	}

	private static void prob2742(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = n  ; i > 0 ; i--){
			System.out.println(i);
		}				
	}

	private static void prob11021(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+ (a+b));
		}				
	}
	
	private static void prob11022(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= n ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+a+ " + "+ b +" = "+(a+b));
		}				
	}
	
	private static void prob2438(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	private static void prob2439(BufferedReader br) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++){
				if((n-1)-j > i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	
	private static void prob10871(BufferedReader br) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < test ; i++) {
			int comp = Integer.parseInt(st.nextToken());
			if(comp < n) System.out.print(comp + " ");
		}
	}
}
/*
문제 - 2741
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

*/
/*
문제 - 2742
자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
*/
/*
문제 - 11021
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/
/*
문제 11022
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
*/
/*
문제 - 2438
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/
/*
문제 -2439
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/
/*
문제 - 10871
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
*/