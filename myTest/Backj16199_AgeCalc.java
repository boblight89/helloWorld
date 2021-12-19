package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Backj16199_AgeCalc {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		Calendar birth = Calendar.getInstance();
		birth.set(year,month-1,day);
		
		st = new StringTokenizer(br.readLine());
		year = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken());
		day = Integer.parseInt(st.nextToken());		
		Calendar standard = Calendar.getInstance();
		standard.set(year,month-1,day);
		/*
		long dayCal = (standard.getTimeInMillis() - birth.getTimeInMillis())/(24*60*60*1000);//�ϼ� ����
		System.out.println((int)Math.floor(dayCal/365)); //������ ���� - ����
		*/
		int yearComp = standard.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
		int man = yearComp-1;
		if(standard.get(Calendar.MONTH) == birth.get(Calendar.MONTH)) {
			if(standard.get(Calendar.DATE) >= birth.get(Calendar.DATE)) {
				man+=1;
			}
		}else if(standard.get(Calendar.MONTH) > birth.get(Calendar.MONTH)) {
			man+=1;
		}
		System.out.println(man);
		System.out.println(yearComp+1);
		System.out.println(yearComp);
	}
}
/*

����
�ѱ����� ���̴� �� 3���� ������ �ִ�.
    �� ����: �������� ǥ�� ����̴�. �ѱ������� �������� �� ���̸��� ����Ѵ�.
    ���� ����: �ѱ����� ���� ���̸� ����� ���� ���̸� �ǹ��Ѵ�.
    �� ����: �������� �ϰ������� ����� �����ϱ� ���ؼ� ����ϴ� �����̴�.

�� ���̴� ������ �������� ����Ѵ�. � ����� �¾�� ��, �� ����� ���̴� 0���̰�, ������ ���� ������ 1���� �����Ѵ�. ���� ���, ������ 2003�� 3�� 5���� ����� 2004�� 3�� 4�ϱ��� 0���̰�, 2004�� 3�� 5�Ϻ��� 2005�� 3�� 4�ϱ��� 1���̴�.
���� ���̴� ������ �������� ����Ѵ�. � ����� �¾�� ��, �� ����� ���̴� 1���̰�, ������ �ٲ� ������ 1���� �����Ѵ�. ���� ���, ������ 2003�� 3�� 5���� ����� 2003�� 12�� 31�ϱ��� 1���̰�, 2004�� 1�� 1�Ϻ��� 2004�� 12�� 31�ϱ��� 2���̴�.
�� ���̴� ������ �������� ����ϰ�, ���� �������� ������ �� ���̴�. ���� ���, ������ 2003�� 3�� 5���� ����� 2003�� 12�� 31�ϱ��� 0���̰�, 2004�� 1�� 1�Ϻ��� 2004�� 12�� 31�ϱ��� 1���̴�.
� ����� ������ϰ� ���� ��¥�� �־����� ��, ���� ��¥�� �������� �� ����� �� ����, ���� ����, �� ���̸� ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� � ����� �¾ ����, ��, ���� �־�����. ��������� �������� ���еǾ��� �ְ�, �׻� �ùٸ� ��¥�� �־�����.
��° �ٿ� ���� ��¥�� �־�����. ���� ��¥�� �������� ���еǾ��� ������, �ùٸ� ��¥�� �־�����.
�Է����� �־����� ��������� ���� ��¥�� ���ų� �� �����̴�.
�Է����� �־����� ������ 1900�⺸�� ũ�ų� ����, 2100�⺸�� �۰ų� ����.

���
ù° �ٿ� �� ����, ��° �ٿ� ���� ����, ��° �ٿ� �� ���̸� ����Ѵ�.

���� �Է� 1
2003 3 5
2003 4 5

���� ��� 1
0
1
0

���� �Է� 2
2003 3 5
2004 1 1

���� ��� 2
0
2
1
*/