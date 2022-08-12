import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // bf
		int n = Integer.parseInt(bf.readLine()); // วัมู
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<n;i++) {
			String s = bf.readLine();
			int score = 0;
			int add = 0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='O') {
					add++;
					score += add;
				}
				else
					add = 0;
			}
			sb.append(score+"\n");
		}
		System.out.println(sb);
	}
}
