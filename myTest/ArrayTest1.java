package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayTest1 {

	public static void main(String[] args) throws IOException {
		//prob10818();
		//prob2562();
		//prob2577();
		prob3052();
	}

	private static void prob3052() throws IOException  {
		int[] arr = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] %= 42;
		}
		Arrays.sort(arr);
		int result = 1;
		for(int i = 1; i < arr.length ; i++) {
			if(arr[i-1] != arr[i]) {
				result += 1;
			}
		}
		System.out.println(result);
	}

	private static void prob2577() throws IOException {
		int[] arr = new int[10];
		Arrays.fill(arr, 0);
		int[] nums = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0 ; i < 3 ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		for(int i = 1 ; i < 3 ; i++) {
			nums[0] *= nums[i];
		}
		char[] resultChar = String.valueOf(nums[0]).toCharArray();
		char ch0 = '0';
		for(int i = 0 ; i < resultChar.length ; i++) {
			int locArr = resultChar[i] - ch0;
			arr[locArr] += 1;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void prob2562() throws IOException {
		int[] arr = new int[9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1;
		int maxarr = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
				maxarr = i+1;
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(maxarr);
	}

	private static void prob10818() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int max = -1000001;
		int min = 1000001;
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		//배열없이 들어온 값 확인할때 최대 최소 구할수도 있지만, 배열문제니 배열을 사용해보자.
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		System.out.println(min + " "+ max);
		
		
	}

}
/*

문제 - 3052
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

예제입력
39
40
41
42
43
44
82
83
84
85

예제출력
6

*/
/*
문제 - 2577
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

입력
첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.

출력
첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

예제입력
150
266
427

예제출력
3
1
0
2
0
0
0
2
0
0
*/

/*
문제 - 2562
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

입력예제
3
29
38
12
57
74
40
85
61

예제출력
85
8
*/

/*
문제 - 10818
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제입력
5
20 10 35 30 7

예제출력
7 35
*/

