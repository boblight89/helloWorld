package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] length = new int[3];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = 0;
			int max = -1;
			int maxlen = -1;
			for(int i = 0 ; i < 3 ; i++) {
				length[i] = Integer.parseInt(st.nextToken());
				if(length[i] == 0) count++;
				else if(max < length[i]) {
					max = length[i];
					maxlen = i;
				}
			}
			if(count >= 3) break;
			else {
				long large = 0;
				long comp = 0;
				for(int i = 0 ; i < 3 ; i++) {
					if(i == maxlen) {
						large += length[i]*length[i];
					}else {
						comp += length[i]*length[i];
					}
				}
				if(large == comp) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		}		
	}
}
/*
문제 - 4153(직각 삼각형)
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

입력
입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

출력
각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

예제 입력
6 8 10
25 52 60
5 12 13
0 0 0

예제 출력
right
wrong
right

*/