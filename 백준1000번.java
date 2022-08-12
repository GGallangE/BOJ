import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준1000번 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // system에 입력받은걸 buffer에 넣어줌
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n1 = Integer.parseInt(st.nextToken());  // nextToken 은 띄워쓰기 단위 즉 split 이다.
		int n2 = Integer.parseInt(st.nextToken());
		System.out.println(n1+n2);
	}

}
