package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backj11720_Strplus {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] cstr = str.toCharArray();
		int result = 0;
		for(int i = 0 ; i < n ; i++) {
			int plus = cstr[i] - '0';
			result += plus;
		}
		System.out.println(result);
	}
}
