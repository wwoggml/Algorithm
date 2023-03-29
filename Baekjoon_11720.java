import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String sNum = br.readLine();
        char[] cNum = sNum.toCharArray();

        for(int i = 0; i<cNum.length; i++) {
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}
