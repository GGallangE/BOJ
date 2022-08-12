import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2755번 {

    static String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
    static double[] credits = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double sumCredits = 0; // 총 학점
        double scores = 0; // 총점

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 띄워주기
            double credit = Integer.parseInt(st.nextToken()); // 과목, 학점, 영어학점 중 학점 저장
            String score = st.nextToken(); // score에 한칸띄우고 영어 학점 저장
            double scoreDouble = credits[getIndex(score)]; // getindex로 score를 double로 변환시켜준다.
            scores += credit * scoreDouble; // 학점과 영어학점을 숫자로 환산한거를 곱한것.
            sumCredits += credit; // 내가 학기에 들은 총 학점
        }

        System.out.println(String.format("%.2f", scores/sumCredits));


    }

    private static int getIndex(String score) {
        int idx = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].equals(score)) { // grades 배열에서 입력한 영어학점과 동일한 배열순번을 반환.
                idx = i;
            }
        }
        return idx;
    }
}