import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int i,a,b;
        int[] sumarray = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (i = 1; i<= N; i++) {
            sumarray[i] = sumarray[i-1] + Integer.parseInt(st.nextToken());;
        }

        for(i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println(sumarray[b] - sumarray[a-1]);
        }
    }
}
