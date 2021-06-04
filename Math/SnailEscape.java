package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailEscape {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int result = (v-b)/(a-b);
		if((v-b)%(a-b) != 0) result++;
		System.out.println(result);
	}
}

/*
 �칰�� ������
 ���̰� V������ �칰���� �����̰� ������ �Ѵ�.
 ������ A���͸� �ö󰡰�, �㿡�� B���� �̲����� �������� �Ҷ�, �����̰� �칰���� �������� ��ĥ�� �ɸ����� ���Ͻÿ�
 
 �Է����� 1<= b < a <= v <= 1000000000
 */
/*
 BufferedReader �� Scanner ���� ������. �ӵ��� �� �ʿ��Ҷ��� �̰� �������...
*/