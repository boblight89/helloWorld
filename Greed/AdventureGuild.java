package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdventureGuild {

	int[] fear;
	
	AdventureGuild(int[] fear){
		this.fear = fear.clone();
		Arrays.sort(this.fear);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] f = new int[n];
		Random r = new Random();
		for(int i = 0 ; i < n ; i++) {
			f[i] = sc.nextInt();	//수동
//			f[i] = r.nextInt(n+1);	//자동
		}
		sc.close();
		long bf;
		long af;
		int result;
		
		AdventureGuild ag = new AdventureGuild(f);
		
		for(int i = 0 ; i < ag.fear.length ; i++) {
			System.out.print(ag.fear[i] + " ");
			if(i > 20) break;
		}
		System.out.println("");
		bf = System.currentTimeMillis();
		result = ag.getMaxGroup();
		af = System.currentTimeMillis();
		System.out.println(result);
		System.out.println("time : "+(af - bf)+ "ms");
		
		bf = System.currentTimeMillis();
		result = ag.advancedGetMaxGroup();
		af = System.currentTimeMillis();
		System.out.println(result);
		System.out.println("time : "+(af - bf)+ "ms");
	}

	private int getMaxGroup() {
		int result = 0;
		int require = 0;
		boolean isFirst = false;
		for(int i = 0; i < fear.length ; i++) {
			isFirst = false;	//그룹의 첫 인원인 경우 체크
			if(require == 0) {	//요구자가 없을경우 = 저번 인원까지 모험을 나간경우
				require = fear[i];	//현 모험가의 공포도 를 넣고
				isFirst = true;		//그룹 첫 인원 표기
			}
			if(!isFirst && fear[i] > fear[i-1]) require += (fear[i] - fear[i-1]);
			//첫 인원이 아니고, 이전 모험가보다 현 모험가가 공포도가 높은경우, 그 모험가의 공포도에 요구인원을 맞춤
			require -= 1;	//인원수를 줄임
			if(require == 0) {
				result += 1;
			}
		}
		return result;
	}
	
	private int advancedGetMaxGroup() {	//참고 서적에서 사용한 코드. 더 빠르게 답을 출력한다.
		int result = 0;
		int count = 0;
		for(int i = 0; i < fear.length ; i++) {
			count+=1;
			if(fear[i] <= count) {
				result+=1;
				count = 0;
			}
		}
		return result;
	}

}
/*
 그리드 응용문제
 모험가 길드
 N명의 모험가가 있고, 각 모험가는 X만큼의 공포도를 가지고 있다.
 모험가의 안전을 위해서 공포도가 X인 모험가는 X명 이상의 그룹이 되어야만 모험을 떠날수 있다.
 이때, 입력받은 모험가들 그룹에서 모험을 떠날수 있는 그룹의 최대수를 구하는 프로그램
 
 입력
 첫줄: 모험가수 N ( 1 <= N < = 100000)
 둘째줄: 각 모험가의 공포수 X (1 <= X[i] < N)
 출력
 모험가 그룹 수 
 */