import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isGroupString()) count++;
        }
        System.out.println(count);
    }

    public static boolean isGroupString() throws IOException {
        boolean[] alphabetArr = new boolean[26];
        int previousChar = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != previousChar) {
                if (!alphabetArr[ch - 'a']) {
                    alphabetArr[ch - 'a'] = true;
                    previousChar = ch;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}

/*   내가 짠 코드인데 4번이 실행이 안됨..
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		char check[][] = new char[100][100];
		int arr[] = new int[100];
		int count =0;
		for(int i=0;i<n;i++) {
			Arrays.fill(arr, 0);
			String s = bf.readLine();
			for(int j=0;j<s.length();j++) {
				check[i][j] = s.charAt(j);
				if(j==0)
					arr[check[i][j]-'a'] ++;
				else if(check[i][j-1]==check[i][j])
					continue;
				else
					arr[check[i][j]-'a'] ++;
			}
			for(int j=0;j<s.length();j++) {
				if(arr[j]>1) {
					count++;
					break;
				}
			}
			
		}
		
		System.out.println(n-count);
	}
}
*/