package test.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backj4366_AverageSpeed {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int line = 0;		int speed = 0;		int currTime = 0;		double result = 0;
		
		while((str = br.readLine()) != null) {
			line = 0;
			String timeStr = "";
			StringTokenizer st = new StringTokenizer(str, " ");
			while(st.hasMoreTokens()) {
				line++;
				if(line == 1) {
					timeStr = st.nextToken();
					String[] tt;
					tt = timeStr.split(":");
					int time = 0;
					time = Integer.parseInt(tt[0]) * 3600 + Integer.parseInt(tt[1]) * 60 + Integer.parseInt(tt[2]);
					int moveTime = 0;
					moveTime = time - currTime;
					if(moveTime > 0) result += ((double)moveTime/3600) * speed;
					currTime = time;
				}else if(line == 2) {
					String sp = st.nextToken();
					if(sp != null) {
						speed = Integer.parseInt(sp);
					} 
				}else {
					break;
				}
			}
			
			if(line == 1) {
				System.out.printf("%s %.2f km\n",timeStr,result);
			}
		
		}
		br.close();
	}

}
/*

����

You have bought a car in order to drive from Waterloo to a big city.The odometer on their car is broken, so you cannot measure distance.But the speedometer and cruise control both work, so the car can maintain a constant speed which can be adjusted from time to time in response to speed limits, traffic jams, and border queues. You have a stopwatch and note the elapsed time every time the speed changes. From time to time you wonder, "how far have I come?". To solve this problem you must write a program to run on your laptop computer in the passenger seat.

�Է�

Standard input contains several lines of input: Each speed change is indicated by a line specifying the elapsed time since the beginning of the trip (hh:mm:ss), followed by the new speed in km/h. Each query is indicated by a line containing the elapsed time. At the outset of the trip the car is stationary. Elapsed times are given in non-decreasing order and there is at most one speed change at any given time.

���

For each query in standard input, you should print a line giving the time and the distance travelled, in the format below.

���� �Է� 1

00:00:01 100
00:15:01
00:30:01
01:00:01 50
03:00:01
03:00:05 140

���� ��� 1

00:15:01 25.00 km
00:30:01 50.00 km
03:00:01 200.00 km

*/
/*
���ǻ���: �Է��� ������ �������� ������ ��(EOF)�� Ȯ���ϴ� ����� ����Ѵ�.
���⼭�� �Է��� br.readLine ���� ���� String �� null�� ��� �����ϵ��� �Ͽ���. 
 */
