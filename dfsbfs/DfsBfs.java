package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs {
	
	ArrayList<Integer>[] nodes;
	boolean[] check;
	static int n;//노드 수
	static int m;//간선 수
	static int v;//시작할 노드 번호
	
	
	DfsBfs(){
		nodes = new ArrayList[n+1];
		check = new boolean[n+1];
		for(int i = 1 ; i <= n ; i++) {
			nodes[i] = new ArrayList<Integer>();//초기화
			check[i] = false;	//방문여부 초기화
		}
	}
	
	void addLine(int start, int end) {//양방향 간선
		nodes[start].add(end);
		nodes[end].add(start);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		
		DfsBfs dbfs = new DfsBfs();
		
		for(int i = 0 ; i < m ; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			dbfs.addLine(start,end);
		}
		sc.close();
		
		dbfs.dfs(v);
		dbfs.ResetCheck();
		dbfs.bfs(v);
	}
	
	void ResetCheck(){
		for(int i = 1; i <= n ; i++) {
			check[i] = false;
		}
		System.out.println("");
	}
	
	void dfs(int node){
		if(!check[node]) {
			check[node] = true;
			System.out.print(node+" ");
			int[] linkedNodes = new int[nodes[node].size()];
			for(int i = 0; i < nodes[node].size(); i++) {
				linkedNodes[i] = nodes[node].get(i);
			}
			Arrays.sort(linkedNodes);//정점이 여럿일경우 작은것부터 방문 - 오름차순 정렬 실행
			for(int i = 0; i < linkedNodes.length ; i++) {
				dfs(linkedNodes[i]);
			}
		}
	}
	
	void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			
			int currNode = queue.poll();
			
			if(!check[currNode]) {//방문한적 없을경우
				
				check[currNode] = true;//방문체크 하고
				System.out.print(currNode + " ");//현 노드 표기
				
				int[] linkedNodes = new int[nodes[currNode].size()];
				for(int i = 0; i < nodes[currNode].size(); i++) {
					linkedNodes[i] = nodes[currNode].get(i);
				}
				Arrays.sort(linkedNodes);//정점이 여럿일경우 작은것부터 방문 - 오름차순 정렬 실행
				for(int i = 0 ; i < linkedNodes.length ; i++) {
					queue.add(linkedNodes[i]);
				}
			}
		}
		
	}
}
/*
 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
 정점 번호는 1번부터 N번까지이다.
 입력
 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 */
