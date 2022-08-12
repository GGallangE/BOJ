import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		String first = st.nextToken();
		String second = st.nextToken();
		char one = first.charAt(0);
		char two = first.charAt(1);
		char three = first.charAt(2);
		int f = Character.getNumericValue(three)*100 + Character.getNumericValue(two)*10 + Character.getNumericValue(one);
		one = second.charAt(0);
		two = second.charAt(1);
		three = second.charAt(2);
		int t = Character.getNumericValue(three)*100 + Character.getNumericValue(two)*10 + Character.getNumericValue(one);
		System.out.println((f>t)? f:t);
	}
}
