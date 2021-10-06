package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException {
		//prob1546();
		//prob8598();
		prob4344();
		
	}

	private static void prob4344() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int repeat = 0 ; repeat < n ; repeat++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int[] scores = new int[students];
			float average = 0;
			for(int i = 0 ; i < scores.length ; i++) {
				scores[i] = Integer.parseInt(st.nextToken());
				average += scores[i];
			}
			average /= students;
			float overavg = 0;
			for(int i = 0 ; i < scores.length ; i++) {
				if((float)scores[i] > average) overavg += 1;
			}
			overavg = (overavg/students)*100;
			System.out.printf("%.3f%%\n",overavg);
		}
		br.close();
	}

	private static void prob8598() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int repeat = 0 ; repeat < n ; repeat++) {
			String oxStr = br.readLine().toUpperCase();
			char[] ox = oxStr.toCharArray();
			int currScore = 0;
			int result = 0;
			for(int i = 0 ; i < ox.length ; i++) {
				if(ox[i] == 'O') {
					currScore += 1; 
				}else {
					currScore = 0;
				}
				result += currScore;
			}
			System.out.println(result);
		}
		br.close();
	}

	private static void prob1546() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] orig = new int[n];		//원 점수
		float[] cheat = new float[n];	//부정 점수
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int max = 0; //적어도 하나는 0보다 크다는 조건이 있다. 없을경우 0 이하일경우 오류메시지 송출 등의 추가작업 필요
		for(int i = 0 ; i < n ; i++) {
			orig[i] = Integer.parseInt(st.nextToken());
			if(orig[i] > max) max = orig[i];
		}
		float result = 0;
		for(int i = 0 ; i < n ; i++) {
			cheat[i] = ((float)orig[i]/max)*100;
			result += cheat[i];
		}
		result = (result/n);
		System.out.println(result);
	}

}
/*
문제 - 4344
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

예제입력
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

예제출력
40.000%
57.143%
33.333%
66.667%
55.556%
*/
/*
문제 - 8598
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.

예제입력
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

예제출력
10
9
7
55
30
*/

/*
문제 - 1546
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

출력
첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-2 이하이면 정답이다.

예제입력1
3
40 80 60

예제출력1
75.0
*/