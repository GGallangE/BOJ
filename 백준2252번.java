import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.management.Query;

public class ����2252�� {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()); // �� ����
		int m = Integer.parseInt(st.nextToken()); // �� Ƚ��
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		for(int i=0;i<=n;i++) {
			a.add(new ArrayList<>());
		}
		int indegree[] = new int[n+1];
		
		for(int  i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int front = Integer.parseInt(st.nextToken()); // back ���� �տ� ���;� �ϴ� ��
			int back = Integer.parseInt(st.nextToken()); // front ���� �ڿ� ���;� �ϴ� ��
			a.get(front).add(back); // back �� �ٶ󺸴� front�� �ִ�.
			indegree[back]++;  // �������� �迭 ������ ���� �κ�
		}
		
		// ���� ���� ����
		Queue<Integer> q = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			if(indegree[i] ==0) {	// �ش� ��带 �ٶ󺸴� edge�� �ϳ��� ���ٴ� �ǹ�.
				q.offer(i);  // �ٷ� �����͸� �־��ش�.
			}
		}
		while(!q.isEmpty()) { // ť�� �􋚱��� ��� ����
			int now = q.poll(); // ť���� ���� ���� �ִ� ���� �̾���
			System.out.print(now+" ");  // ���� ��� �� ���
			for(int c : a.get(now)) { // �h�� ��忡�� �� �� �ִ� ����� ����
				indegree[c]--;  // �������� �迭 ���̳ʽ� 1
				if(indegree[c]==0) { // ����� ���������� 0 �̸�
					q.offer(c); // ť�� ��� �߰��ϱ�
				}
			}
		}
		bf.close();
	}
}
