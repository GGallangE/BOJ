import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int plus = Integer.parseInt(bf.readLine());
		int newhour = ((minute+plus) / 60 + hour)%24;
		int newminute = (minute+plus) % 60;
		
		System.out.println(newhour+" "+newminute);
	}
}
