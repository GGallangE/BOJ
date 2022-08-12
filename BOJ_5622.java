import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch <='C')
				sum += 3;
			else if(ch>='D' && ch <='F')
				sum += 4;
			else if(ch>='G' && ch <='I')
				sum += 5;
			else if(ch>='J' && ch <='L')
				sum += 6;
			else if(ch>='M' && ch <='O')
				sum += 7;
			else if(ch>='P' && ch <='S')
				sum += 8;
			else if(ch>='T' && ch <='V')
				sum += 9;
			else if(ch>='W' && ch <='Z')
				sum += 10;
		}
		System.out.println(sum);
	}
}
