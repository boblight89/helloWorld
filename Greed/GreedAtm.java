package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GreedAtm {

	int[] person;
	
	GreedAtm(int[] p){
		person = p;
		Arrays.sort(person);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int[] p = new int[n];
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		GreedAtm mn = new GreedAtm(p);
		
		long result = mn.getTime();
		System.out.println(result);
	}

	private long getTime() {
		long result = 0;
		for(int i = 0 ; i < person.length; i++) {
			int partTime = 0;
			for(int j = 0 ; j <= i ; j++) {
				partTime += person[j];
			}
			result += partTime;
		}
		return result;
	}
}
