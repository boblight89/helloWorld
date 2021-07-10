package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchK {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int result = binarySearchK(k,n);
		System.out.println(result);
	}

	private static int binarySearchK(int k,int n) {
		int result = 0;
		int start = 1;
		int end = k;
		while(start <= end) {
			int mid = (start + end) /2;
			int cnt = 0;
			for(int i = 1 ; i <= n ; i++) {
				cnt += Math.min(mid/i, n);
			}
			
			if(cnt >= k) {
				end = mid-1;
				result = mid;
			}else {
				start = mid+1;
			}
		}
		return result;
	}
}

/*
세준이는 크기가 N×N인 배열 A를 만들었다. 배열에 들어있는 수 A[i][j] = i×j 이다.
이 수를 일차원 배열 B에 넣으면 B의 크기는 N×N이 된다. B를 오름차순 정렬했을 때, B[k]를 구해보자.
배열 A와 B의 인덱스는 1부터 시작한다.

입력
첫째 줄에 배열의 크기 N이 주어진다. N은 10^5보다 작거나 같은 자연수이다. 
둘째 줄에 k가 주어진다. k는 min(10^9, N^2)보다 작거나 같은 자연수이다.

출력
B[k]를 출력한다.

예제 입력
3
7

예제 출력
6
*/
/*
이진탐색으로 풀수 있는 이유

N 을 5라고 가정했을때의 배열
1  2  3  4  5
2  4  6  8 10
3  6  9 12 15
4  8 12 16 20
5 10 15 20 25

그리고 여기에서 k = 11 일 때, 즉 B[11] 을 찾는 경우를 생각해보자.

우리가 찾는 11번째의 숫자를 S 이라고 한다면, 다음과 같이 접근해야 한다.
"전체 숫자 중에서, S보다 작거나 같은 숫자의 개수가 11개보다 작으면 안된다!"
→ 만약 그렇다면, 찾는 숫자의 범위를 큰 쪽으로 옮겨야 한다.
그렇다면, S보다 작거나 같은 숫자의 개수는 어떻게 구할까?
이 계산을 구현하는 것이 이 알고리즘의 핵심이 되겠다.

만약 S를 5라고 가정하고, 5보다 작거나 같은 개수를 찾는 경우를 생각해보자.

1  2  3  4  5 		5
2  4  6  8 10 		2
3  6  9 12 15 		1
4  8 12 16 20 		1
5 10 15 20 25 		1

5보다 작거나 같은 개수를 구하려면, 각 행에서 조건에 맞는 값을 구한 뒤 합하면 된다.
즉, 이 배열에서 5보다 작거나 같은 개수의 합은 10개이다.

그렇다면 S를 8이라고 가정해보자.

1  2  3  4  5 		5
2  4  6  8 10 		4
3  6  9 12 15 		2
4  8 12 16 20 		2
5 10 15 20 25 		1
여기에서는 14이다.

위의 예를 보아, 각 행에서의 S보다 작거나 같은 숫자의 개수는
min(S / i, N) 임을 알 수 있다.
왜냐하면, 각 행은
i * 1,   i * 2,   i * 3,   i * 4,   .....   , i * j 이기 때문에,
S를 i로 나눈 값에 나머지를 버린 값이 그 행에서 S보다 작거나 같은 개수가 되기 때문이다.

그러므로, 우리는 S를 찾기 위해
초기값 = 1,   마지막 값 = k,   중간 값 = (1 + k) / 2
로 시작하는 이분 탐색을 적용하면 된다.
여기에서 마지막 값이 k인 이유는
"B[k] 의 값은 k보다 작거나 같기" 때문이다.
*/