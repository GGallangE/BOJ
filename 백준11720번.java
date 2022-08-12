import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class น้มุ11720น๘ {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		String[] s = bf.readLine().split("");
		int sum = 0;
		for(int i=0;i<n;i++)
			sum += Integer.parseInt(s[i]);
		System.out.println(sum);
	}
}
