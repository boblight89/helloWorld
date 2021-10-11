package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		
		int result = a * (i-1);
		result += 1;
		System.out.println(result);
	}

}

/*
문제 - 2914 (저작권)
창영이는 노래 여러 개를 이어서 부르는 가수이다.
유명한 노래의 비슷한 멜로디를 이어서 부르면서 언제 곡이 넘어갔는지 모르게 만드는 것이 창영이 노래의 특징이다.
이런 노래로 상업적으로 엄청난 성공을 거둔 창영이에게 큰 시련이 찾아왔다. 그것은 바로 저작권이었다.

창영이의 노래에 포함되어 있는 멜로디는 모두 저작권이 다른 사람에게 있는 노래이다.
따라서, 이 음악으로 상업적인 활동을 했기 때문에, 저작권 협회에 저작권료를 내야한다.

창영이는 자신의 앨범에 포함되어있는 저작권이 있는 멜로디의 평균값을 구해보기로 했다. 이 값은 아래와 같이 구할 수 있다.
(창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수)
이때, 평균값은 항상 올림을 해서 정수로 만들어야 한다.
예를 들어, 창영이의 1집 앨범 "영창에서 영원히 영창피아노를 친다"에 총 38개 곡이 수록되어 있고,
이 앨범에 저작권이 있는 멜로디가 894개가 있다면, 평균값은 23.53이 되고 올림해서 24가 된다.

매니저 강산이는 얼마나 많은 사람에게 저작권료를 주어야 하는지 궁금해졌다.
강산이가 알고 있는 정보는 앨범에 수록되어 있는 곡의 개수와 위에서 구한 평균값이다.
이때, 적어도 몇 곡이 저작권이 있는 멜로디인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 앨범에 수록된 곡의 개수 A와 평균값 I가 주어진다. (1 ≤ A, I ≤ 100)

출력
첫째 줄에 적어도 몇 곡이 저작권이 있는 멜로디인지 출력한다.

예제입력 1
38 24

예제출력 1
875

예제입력 2
1 100

예제출력 2
100

예제입력 3
10 10

예제출력 3
91
*/
/*
풀이
평균 = 저작권곡수 /앨범 곡수
이때, 평균(I)은 무조건 올림처리 이므로 나온 평균값에서 1 내리고, 분자를 1 만 올려주면 해당 평균이 나온 최소 멜로디 수가 된다.
(A * (I-1)) + 1 = result
*/