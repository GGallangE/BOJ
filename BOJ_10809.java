import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;  // 배열을 전부 -1로 채움  Arrays.fill(arr,-1) 하면 한번에 채울수 있음. 초기화!!
		}
		String s = bf.readLine();
		
		for(int i=0;i<s.length();i++) {
			char word = s.charAt(i);
			if(arr[word - 'a']==-1)
				arr[word - 'a'] = i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
