package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNum2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int primeSum = 0;
		int primeMin = -1;
		
		if(m >= n) {
			for(int i = m; i >= n ; i--) {
				if(isPrime(i)) {
					primeSum += i;
					primeMin = i;
				}
			}
		}else {
			for(int i = n; i >= m ; i--) {
				if(isPrime(i)) {
					primeSum += i;
					primeMin = i;
				}
			}			
		}
		
		if(primeMin != -1) {
			System.out.println(primeSum);
			System.out.println(primeMin);
		}else {
			System.out.println("-1");
		}
	}
	
	//소수여부 확인은 이전 코드에서 가져왔다.
	private static boolean isPrime(int num) {
		boolean result = true;
		if(num < 2) result = false;
		else if(num <= 3) result =  true;
		else {
			for(int i = 2; i < num/2 + 1 ; i++) {
				if(num % i == 0) {
					result = false;
					break;
				}
			}
		}		
		return result;
	}

}
