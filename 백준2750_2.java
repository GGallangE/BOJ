import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����2750_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // ������ ���� �� ����
		int c[] = new int[n];
		int i;
		for(i=0;i<n;i++) {
			
			c[i] = Integer.parseInt(bf.readLine()); // ������ �� n��
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
		
		while(i<=j) {  // i �� j���� ���� �� ������ �ݺ�, Ŀ���ų� �������� ����
			while(i<=right && c[i] <c[pivot]) {  // pivot ���� ū ���� ������ ���� ����.
				i++;
			}
			while(j>=left+1 && c[j] >= c[pivot]) {  // pivot ���� ���� ���� ������ ���� ����.
				j--;
			}
			if(i>j) { // ������ ��Ȳ�� ��Ÿ��.
				temp = c[j];  // swap����
				c[j] = c[pivot];
				c[pivot] = temp;
			}
			else {
				temp = c[i];  // swap����
				c[i] = c[pivot];
				c[pivot] = temp;
			}
		}
		quicksort(c,left,j-1); // ���� ���� ���ʿ��� ���ļ���
		quicksort(c,j+1,right); // ���� ���� �����ʿ��� ���ļ���
	}
}
