package test.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus {
	ArrayList<Integer>[] computer;
	boolean[] infect;
	static int n;//��� ��
	static int m;//���� ��
	
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
		infect[1] = true;	//����
		
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
		for(int i = 2 ; i< infect.length; i++) {//2���� �����ϴ� ����: ������ ���۵� 1���� �����Ѵ�.
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
 ��ǻ�� ���̷���
 �����ɽ� ����� ��� ��ǻ�Ϳ� ���ĵǴ� ���̷����� �ִ�.
 �����, 1�� ��ǻ�Ͱ� ������ �Ǿ�����, ������ ��ǻ���� ���� ���ϴ� ���α׷�
 
 �Է�����
 ù° �ٿ��� ��ǻ���� ���� �־�����. ��ǻ���� ���� 100 �����̰� �� ��ǻ�Ϳ��� 1�� ���� ���ʴ�� ��ȣ�� �Ű�����.
 ��° �ٿ��� ��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ�� ���� ���� �־�����.
 �̾ �� ����ŭ �� �ٿ� �� �־� ��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ���� ��ȣ ���� �־�����.
 
 �������
 1�� ��ǻ�Ͱ� �� ���̷����� �ɷ��� ��, 1�� ��ǻ�͸� ���� �� ���̷����� �ɸ��� �Ǵ� ��ǻ���� ���� ù° �ٿ� ����Ѵ�.
 
 �Է¿���		��¿��� 
 7			4
 6
 1 2
 2 3
 1 5
 5 2
 5 6
 4 7

 */
