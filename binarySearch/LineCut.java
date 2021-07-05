package binarysearch;
/*
����
������ �ð��� ������ �������� �ڼ����� �θ��� �ް� ���� �޷��Դ�.
�ڼ����� ķ�� �� �� N���� ������ ������ �ϴµ� �ʹ� �ٺ��� �����̿��� ������ û�ߴ�.
�̹� �������� ��ü������ K���� ������ ������ �ִ�. �׷��� K���� ������ ���̰� �������̴�.
�ڼ����� ������ ��� N���� ���� ������ �������� ����� �;��� ������ K���� ������ �߶� ������ �Ѵ�.
���� ��� 300cm ¥�� �������� 140cm ¥�� ������ �� �� �߶󳻸� 20cm�� ������ �Ѵ�. (�̹� �ڸ� ������ ���� �� ����.)
���Ǹ� ���� ������ �ڸ��ų� ���� �� �սǵǴ� ���̴� ���ٰ� �����ϸ�,������ K���� �������� N���� ������ ���� �� ���� ���� ���ٰ� ��������.
�׸��� �ڸ� ���� �׻� ��Ƽ���� ������ �������̸�ŭ �ڸ��ٰ� ��������.
N������ ���� ����� �͵� N���� ����� �Ϳ� ���Եȴ�.
�̶� ���� �� �ִ� �ִ� ������ ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ��� �������� �̹� ������ �ִ� ������ ���� K, �׸��� �ʿ��� ������ ���� N�� �Էµȴ�.
K�� 1�̻� 10,000������ �����̰�, N�� 1�̻� 1,000,000������ �����̴�.
�׸��� �׻� K <= N �̴�. �� �� K�ٿ� ���� �̹� ������ �ִ� �� ������ ���̰� ��Ƽ���� ������ ������ �Էµȴ�.
������ ���̴� 2^31-1���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� N���� ���� �� �ִ� ������ �ִ� ���̸� ��Ƽ���� ������ ������ ����Ѵ�.

�����Է�
4 11
802
743
457
539

�������
200
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LineCut {

	static int reqLine;
	static int[] lines;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		reqLine = Integer.parseInt(st.nextToken());
		
		int maxLine = 0;
		lines = new int[n];
		for(int i = 0 ; i < n ; i++) {
			lines[i] = Integer.parseInt(br.readLine());
			if(lines[i] > maxLine) maxLine = lines[i];
		}
		
		long start = 1;
		long end = maxLine;	
		//���ǻ���: �Է°��� int�� �ִ밪���� �̱� ������, int �� mid,start,end �� �����Ұ�� �����÷ο�� ��ġ�ʴ� ���� ���ü� �ִ�!
		
		long result = getMaxLength(start,end);
		System.out.println(result);
		
		
	}

	private static int getMaxLength(long start, long end) {
		int result = 0;
		
		while(start <= end) {
			int count = 0;
			long mid = (start + end) / 2;
			for(int i = 0 ; i < lines.length ; i++) {
				count += (lines[i]/mid);
			}
			if(count >= reqLine) {
				start = mid+1;
				result = (int)mid;
			}else {
				end = mid-1;
			}
		}
		return result;
	}
}
