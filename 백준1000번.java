import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����1000�� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // system�� �Է¹����� buffer�� �־���
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n1 = Integer.parseInt(st.nextToken());  // nextToken �� ������� ���� �� split �̴�.
		int n2 = Integer.parseInt(st.nextToken());
		System.out.println(n1+n2);
	}

}
