package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		short a = Short.parseShort(st.nextToken());
		short b = Short.parseShort(st.nextToken());
		System.out.println(a+b);
		br.close();
	}	
}
/*
A+B �� �ϴ� ������ �ڵ�.
0 < A,B < 10 �̾ int ��� short�� �Ẹ�Ҵ�.
*/