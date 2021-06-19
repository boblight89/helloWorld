package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class HugeNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		
		System.out.println(a.add(b));
		
	}

}
/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 10^10000)

출력
첫째 줄에 A+B를 출력한다.
*/
//9223372036854775807 9223372036854775808
/*
 java 에서 엄청 큰 수를 다루는 방법
 int 의 최대 크기 - 2147483647
 long 의 최대크기 - 9223372036854775807
 double 은 정수계산에 사용하기에는 오차가 크다.
 10^10000 같은 엄청 큰 정수를 계산할때는 BigInteger가 있다. - 문자열 기반이라 숫자의 제한이 없다.
 
 float,double 은 소수점의 정밀도가 완벽하지 않기에, 아주 큰 실수를 다룰때는 BigDecimal 을 이용한다.
 
 */