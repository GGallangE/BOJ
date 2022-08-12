import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class น้มุ1260น๘ {
	static int[][] check;
	static boolean[] visited;
	static int n;
	static int m;
	static int v;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		check = new int [n+1][n+1];
		visited = new boolean[n+1];
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			check[x][y] = check[y][x] = 1;
		}
		dfs(v);
		bfs(v);
	}
	private static void bfs(int v) {
		// TODO Auto-generated method stub
		
	}
	private static void dfs(int v) {
		// TODO Auto-generated method stub
		if(visited[v]==true) return;
		visited[v] = true;
		System.out.println(v+" ");
		for(int i=0;i<=n;i++) {
			if(check[v][i] == 1)
				dfs(i);
		}
	}
}
