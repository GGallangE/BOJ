import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����2755�� {

    static String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
    static double[] credits = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double sumCredits = 0; // �� ����
        double scores = 0; // ����

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // ����ֱ�
            double credit = Integer.parseInt(st.nextToken()); // ����, ����, �������� �� ���� ����
            String score = st.nextToken(); // score�� ��ĭ���� ���� ���� ����
            double scoreDouble = credits[getIndex(score)]; // getindex�� score�� double�� ��ȯ�����ش�.
            scores += credit * scoreDouble; // ������ ���������� ���ڷ� ȯ���ѰŸ� ���Ѱ�.
            sumCredits += credit; // ���� �б⿡ ���� �� ����
        }

        System.out.println(String.format("%.2f", scores/sumCredits));


    }

    private static int getIndex(String score) {
        int idx = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].equals(score)) { // grades �迭���� �Է��� ���������� ������ �迭������ ��ȯ.
                idx = i;
            }
        }
        return idx;
    }
}