package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailEscape {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int result = (v-b)/(a-b);
		if((v-b)%(a-b) != 0) result++;
		System.out.println(result);
	}
}

/*
 우물안 달팽이
 깊이가 V미터인 우물에서 달팽이가 나가려 한다.
 낮에는 A미터를 올라가고, 밤에는 B미터 미끄러져 내려간다 할때, 달팽이가 우물에서 나가려면 며칠이 걸리는지 구하시오
 
 입력조건 1<= b < a <= v <= 1000000000
 */
/*
 BufferedReader 는 Scanner 보다 빠르다. 속도가 더 필요할때는 이걸 사용하자...
*/