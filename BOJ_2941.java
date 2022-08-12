import java.io.*;
import java.util.*;
public class BOJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (s.charAt(i) == 'c') {
                //c=客 c- 眉农
                if (i < s.length()-1 && (s.charAt(i+1) == '-' || s.charAt(i+1) == '=')) {
                    i++;
                }
            }
            else if (s.charAt(i) == 'd') {
                //d- 眉农
                if (i < s.length()-1 && s.charAt(i+1) == '-') {
                    i++;
                } else if (i < s.length()-2 && s.substring(i,i+3).equals("dz=")) {
                    //dz= 眉农
                    i += 2;
                }
            }
            //lj 眉农
            else if (s.charAt(i) =='l') {
                if (i <s.length()-1 && s.charAt(i+1) == 'j') {
                    i++;
                }
            }
            //nj 眉农
            else if (s.charAt(i) =='n') {
                if (i <s.length()-1 && s.charAt(i+1) == 'j') {
                    i++;
                }
            }
            //s= 眉农
            else if (s.charAt(i) =='s') {
                if (i <s.length()-1 && s.charAt(i+1) == '=') {
                    i++;
                }
            }
            //z= 眉农
            else if (s.charAt(i) =='z') {
                if (i <s.length()-1 && s.charAt(i+1) == '=') {
                    i++;
                }
            }
        }
        System.out.print(count);
    }
}