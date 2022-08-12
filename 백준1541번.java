import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class น้มุ1541น๘ {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    String[] sub = bf.readLine().split("\\-");
	    int answer = 0;
	    for(int i=0;i<sub.length;i++) {
	    	String[] add = sub[i].split("\\+");
	    	for(int j=0;j<add.length;j++) {
	    		if(i==0) answer += Integer.parseInt(add[j]);
	    		else answer -= Integer.parseInt(add[j]);
	    	}
	    }
	    System.out.println(answer);
	}
}
