import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2750_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 정렬할 수의 총 개수
		int c[] = new int[n];
		int i;
		for(i=0;i<n;i++) {
			
			c[i] = Integer.parseInt(bf.readLine()); // 임의의 수 n개
		}
		quicksort(c,0,n-1);
		
		for(i=0;i<n;i++)
			System.out.println(c[i]);
		
	}
		
	public static void quicksort(int[] c, int left, int right) {
		if(left >= right) return;
		
		int pivot = left;
		int i = left +1;
		int j = right;
		int temp;
		
		while(i<=j) {  // i 가 j보다 작을 때 까지만 반복, 커지거나 엇갈리면 종료
			while(i<=right && c[i] <c[pivot]) {  // pivot 보다 큰 값을 만날때 까지 간다.
				i++;
			}
			while(j>=left+1 && c[j] >= c[pivot]) {  // pivot 보다 작은 값을 만날떄 까지 간다.
				j--;
			}
			if(i>j) { // 엇갈린 상황이 나타남.
				temp = c[j];  // swap과정
				c[j] = c[pivot];
				c[pivot] = temp;
			}
			else {
				temp = c[i];  // swap과정
				c[i] = c[pivot];
				c[pivot] = temp;
			}
		}
		quicksort(c,left,j-1); // 분할 이후 왼쪽에서 정렬수행
		quicksort(c,j+1,right); // 분할 이후 오른쪽에서 정렬수행
	}
}
