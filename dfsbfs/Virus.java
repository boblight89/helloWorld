package test.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {
	ArrayList<Integer>[] computer;
	boolean[] infect;
	static int n;//노드 수
	static int m;//간선 수
	
	public Virus(Scanner sc) {
		computer = new ArrayList[n+1];
		infect = new boolean[n+1];
		for(int i = 1 ; i<=n; i++) {
			computer[i] = new ArrayList<Integer>();
			infect[i] = false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		Virus vi = new Virus(sc);
		
		for(int i = 0 ; i < m ; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			vi.addLine(start,end);
		}
		
		vi.virusBurst();
	}

	private void virusBurst() {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		infect[1] = true;	//감염
		
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			for(int i = 0 ; i < computer[curr].size() ; i++) {
				int conn = computer[curr].get(i);
				if(!infect[conn]) {
					infect[conn] = true;
					queue.add(conn);
				}
			}
		}
		
		int result = 0;
		for(int i = 2 ; i< infect.length; i++) {//2부터 시작하는 이유: 감염이 시작된 1번은 제외한다.
			if(infect[i]) result+=1;	
		}
		System.out.println(result);
		
	}

	private void addLine(int start, int end) {
		computer[start].add(end);
		computer[end].add(start);
	}
}

/*
 컴퓨터 바이러스
 감염될시 연결된 모든 컴퓨터에 전파되는 바이러스가 있다.
 어느날, 1번 컴퓨터가 감염이 되었을때, 감염된 컴퓨터의 수를 구하는 프로그램
 
 입력조건
 첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다.
 둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다.
 이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.
 
 출력조건
 1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.
 
 입력예시		출력예시 
 7			4
 6
 1 2
 2 3
 1 5
 5 2
 5 6
 4 7

 */
