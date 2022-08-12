import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int c[];
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int number = Integer.parseInt(st.nextToken());
			double sum =0;
			double average = 0;
			c =new int[number];
			for(int j=0;j<number;j++) {
				int val = Integer.parseInt(st.nextToken());
				c[j] = val;
				sum += val;
			}
			average = sum / number;
			double count = 0;
			for(int j=0;j<number;j++) {
				if(c[j]>average)
					count++;
			}
			System.out.printf("%.3f%%\n",(count/number)*100);
		}
		
	}
}
