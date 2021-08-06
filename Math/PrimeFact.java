package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFact {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		while(num != 1) {
			boolean divide = false;
			for(int i = 2 ; i <= num/2 ; i++) {
				if(num % i == 0) {
					num = num / i;
					System.out.println(i);
					divide = true;
					break;
				}
			}
			if(!divide) {
				System.out.println(num);
				num = 1;
			}
		}
	}
}
