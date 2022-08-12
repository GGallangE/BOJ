import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 시간에러 뜸...
public class 백준1517번 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int temp;
		int count=0;
		int c[] = new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(c[j]>c[j+1]) {
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
