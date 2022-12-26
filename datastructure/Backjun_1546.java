import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Backjun_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        double avg = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score);
        int Max = score[score.length - 1];

        for(int i = 0; i<score.length; i++) {
            avg += score[i];
        }

        System.out.println(avg * 100 / N / Max);
    }
}
