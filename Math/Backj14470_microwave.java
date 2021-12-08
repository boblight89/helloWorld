package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backj14470_microwave {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());	//초기 고기 온도
		int b = Integer.parseInt(br.readLine());	//목표온도
		int c = Integer.parseInt(br.readLine());	//언 고기를 1℃데우는 시간 
		int d = Integer.parseInt(br.readLine());	//0도일때 해동하는시간
		int e = Integer.parseInt(br.readLine());	//녹은 고기를 1℃데우는 시간
		if(a < 0) {
			int result = d + b*e - a*c ; 
			System.out.println(result);
		}else {
			int result = (b-a)*e;
			System.out.println(result);
		}
	}
}
/*
문제
JOI 군은 식사 준비를 위해 A℃의 고기를 전자레인지로 B℃까지 데우려고 한다. 고기는 온도가 0℃보다 낮을 때 얼어 있고,
0℃보다 높을 때는 얼어 있지 않다. 온도가 정확히 0℃일 때 고기는 얼어 있을 수도, 얼어 있지 않을 수도 있다.

JOI 군은 가열할 때 고기가 아래의 규칙을 따라 데워진다고 가정하고, 고기를 데우는 데 걸리는 시간을 어림하기로 했다.

    고기가 얼어 있고 온도가 0℃ 미만일 때 : 온도가 C초에 1℃씩 오른다.
    고기가 얼어 있고 온도가 정확히 0℃일 때 : 얼어 있지 않은 상태로 만드는(해동하는) 데 D초가 걸린다.
    고기가 얼어 있지 않을 때 : 온도가 E초에 1℃씩 오른다.

이 규칙을 토대로, 고기가 B℃까지 데워지는 데 몇 초가 걸리는지 구하라.

입력

입력은 총 5줄로, 한 줄에 한 개씩의 정수가 주어진다.
    첫 줄에는 원래의 고기의 온도 A가 주어진다. 단, A는 -100 이상 100 이하이며, 0이 아니다.
    둘째 줄에는 목표 온도 B가 주어진다. 단, B는 1 이상 100 이하이며, A보다 크다.
    셋째 줄에는 얼어 있는 고기를 1℃ 데우는 데 걸리는 시간 C가 주어진다.
    넷째 줄에는 얼어 있는 고기를 해동하는 데 걸리는 시간 D가 주어진다.
    다섯째 줄에는 얼어 있지 않은 고기를 1℃ 데우는 데 걸리는 시간 E가 주어진다.
C, D, E는 모두 1 이상 100 이하이다.

출력
고기를 B℃로 데우는 데 걸리는 시간을 초 단위로 한 줄에 출력하라.

예제 입력 1
-10
20
5
10
3

예제 출력 1
120

*/