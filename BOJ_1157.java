import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력값을 대문자로 바꿔 저장
		String S = br.readLine().toUpperCase();
		//알파벳 중복 개수의 최댓값을 저장할 변수
		int max = 0;
		//중복개수가 최댓값인 알파벳을 저장 할 변수
		String result = "";
		
		//무한루프(알파벳의 개수는 26개이기때문에 26번 반복하는 반복문을 만들어도 된다.)
		while(true) {
			//현재 문자열의 0 인덱스 값을 저장
			String index = String.valueOf(S.charAt(0));
			//현재 문자열의 길이를 저장
			int size = S.length();
			//0인덱스 값을 문자열에서 제외
			S = S.replace(String.valueOf(S.charAt(0)), "");
			//제외한 후의 문자열의 길이
			int newsize = S.length();
			
			//두 길이의 차가 중복개수
			//중복개수가 최댓값과 같으면 result에 알파벳을 더한다.
			if(max == (size - newsize)) {
				result += index;
			}
			//중복개수가 최댓값보다 크면 최댓값에 중복개수를 저장하고, result에 알파벳을 저장.
			if(max < (size - newsize)) {
				max = (size - newsize);
				result = index;
			}
			//문자열이 비게되면 무한루프 종료
			if(S.equals("")) break;
		}
		//result에 알팦벳이 1개이면 result 출력.
		//아니면 ?출력
		if(result.length() == 1) {
			System.out.println(result);
		}else {
			System.out.println("?");
		}
	}

}