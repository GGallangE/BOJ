import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class น้มุ1929น๘ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int M = Integer.parseInt(tokenizer.nextToken());
        int N = Integer.parseInt(tokenizer.nextToken());
        reader.close();
        boolean[] primes = new boolean[N+1];
        Arrays.fill(primes,true);
        primes[1] = false;

        for(int i=2; i*i<=N; i++){
            if(primes[i]){
                for(int j= i*i; j<=N; j+=i){
                    primes[j] = false;
                }
            }
        }

        for(int i=M; i<=N; i++){
            if(primes[i]){
                System.out.println(i);
            }
        }
    }

}