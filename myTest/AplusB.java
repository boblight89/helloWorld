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
A+B 를 하는 간단한 코드.
0 < A,B < 10 이어서 int 대신 short를 써보았다.
*/