import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����11049�� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N][N]; // ���� Ƚ�� �迭
		int[][] data = new int[N][2]; // �Է°��� �޾��ִ� �迭
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());  // �Է°� : ��
			data[i][1] = Integer.parseInt(st.nextToken());  // �Է°� : ��
		}
		for(int k=1; k<N; k++) {
			for(int i=0; i+k<N; i++) {
				dp[i][i+k] = Integer.MAX_VALUE; // �ּҰ��� ã������ �Ϻη� �ִ밪�� �־���.
				for(int j=i; j<i+k; j++)
					dp[i][i+k] = Math.min(dp[i][i+k], dp[i][j]+dp[j+1][i+k] + data[i][0]*data[j][1]*data[i+k][1]); // J�� ��ȣ�� ������ ������.
			}
		}
		
		
		System.out.println(dp[0][N-1]);
	}
}