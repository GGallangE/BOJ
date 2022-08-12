import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class BOJ_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i=0;i<testcase;i++) {
			st = new StringTokenizer(bf.readLine());
			int number = Integer.parseInt(st.nextToken());
			String text = st.nextToken();
			for(int j =0;j<text.length();j++) {
				char ch = text.charAt(j);
				for(int l=0;l<number;l++)
					sb.append(ch);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
