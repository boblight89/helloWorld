package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs {
	
	ArrayList<Integer>[] nodes;
	boolean[] check;
	static int n;//��� ��
	static int m;//���� ��
	static int v;//������ ��� ��ȣ
	
	
	DfsBfs(){
		nodes = new ArrayList[n+1];
		check = new boolean[n+1];
		for(int i = 1 ; i <= n ; i++) {
			nodes[i] = new ArrayList<Integer>();//�ʱ�ȭ
			check[i] = false;	//�湮���� �ʱ�ȭ
		}
	}
	
	void addLine(int start, int end) {//����� ����
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
			Arrays.sort(linkedNodes);//������ �����ϰ�� �����ͺ��� �湮 - �������� ���� ����
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
			
			if(!check[currNode]) {//�湮���� �������
				
				check[currNode] = true;//�湮üũ �ϰ�
				System.out.print(currNode + " ");//�� ��� ǥ��
				
				int[] linkedNodes = new int[nodes[currNode].size()];
				for(int i = 0; i < nodes[currNode].size(); i++) {
					linkedNodes[i] = nodes[currNode].get(i);
				}
				Arrays.sort(linkedNodes);//������ �����ϰ�� �����ͺ��� �湮 - �������� ���� ����
				for(int i = 0 ; i < linkedNodes.length ; i++) {
					queue.add(linkedNodes[i]);
				}
			}
		}
		
	}
}
/*
 �׷����� DFS�� Ž���� ����� BFS�� Ž���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 ��, �湮�� �� �ִ� ������ ���� ���� ��쿡�� ���� ��ȣ�� ���� ���� ���� �湮�ϰ�, �� �̻� �湮�� �� �ִ� ���� ���� ��� �����Ѵ�.
 ���� ��ȣ�� 1������ N�������̴�.
 �Է�
 ù° �ٿ� ������ ���� N(1 �� N �� 1,000), ������ ���� M(1 �� M �� 10,000), Ž���� ������ ������ ��ȣ V�� �־�����.
 ���� M���� �ٿ��� ������ �����ϴ� �� ������ ��ȣ�� �־�����.
 � �� ���� ���̿� ���� ���� ������ ���� �� �ִ�. �Է����� �־����� ������ ������̴�.
 */
