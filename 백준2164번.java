import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class น้มุ2164น๘ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		LinkedList<Integer> li = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			li.add(i);
		}
		while(li.size() >1) {
			li.poll();
			li.offer(li.poll());
		}
		System.out.println(li.poll());
	}
}
