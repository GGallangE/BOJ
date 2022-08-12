import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.management.Query;

public class 백준2252번 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()); // 총 개수
		int m = Integer.parseInt(st.nextToken()); // 비교 횟수
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			a.add(new ArrayList<>());
		}
		int indegree[] = new int[n+1];
		
		for(int  i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int front = Integer.parseInt(st.nextToken()); // back 보다 앞에 나와야 하는 수
			int back = Integer.parseInt(st.nextToken()); // front 보다 뒤에 나와야 하는 수
			a.get(front).add(back); // back 을 바라보는 front가 있다.
			indegree[back]++;  // 진입차수 배열 데이터 저장 부분
		}
		
		// 위상 정렬 실행
		Queue<Integer> q = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			if(indegree[i] ==0) {	// 해당 노드를 바라보는 edge가 하나도 없다는 의미.
				q.offer(i);  // 바로 데이터를 넣어준다.
			}
		}
		while(!q.isEmpty()) { // 큐가 빌떄까지 계속 돌림
			int now = q.poll(); // 큐에서 제일 위에 있는 것을 뽑아줌
			System.out.print(now+" ");  // 현재 노드 값 출력
			for(int c : a.get(now)) { // 햔제 노드에서 갈 수 있는 노드의 개수
				indegree[c]--;  // 진입차수 배열 마이너스 1
				if(indegree[c]==0) { // 노드의 진입차수가 0 이면
					q.offer(c); // 큐에 노드 추가하기
				}
			}
		}
		bf.close();
	}
}
