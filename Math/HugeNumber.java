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
����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A�� B�� �־�����. (0 < A,B < 10^10000)

���
ù° �ٿ� A+B�� ����Ѵ�.
*/
//9223372036854775807 9223372036854775808
/*
 java ���� ��û ū ���� �ٷ�� ���
 int �� �ִ� ũ�� - 2147483647
 long �� �ִ�ũ�� - 9223372036854775807
 double �� ������꿡 ����ϱ⿡�� ������ ũ��.
 10^10000 ���� ��û ū ������ ����Ҷ��� BigInteger�� �ִ�. - ���ڿ� ����̶� ������ ������ ����.
 
 float,double �� �Ҽ����� ���е��� �Ϻ����� �ʱ⿡, ���� ū �Ǽ��� �ٷ궧�� BigDecimal �� �̿��Ѵ�.
 
 */