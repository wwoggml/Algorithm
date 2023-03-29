import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int x1, y1, x2, y2;
        int[][] D = new int[N+1][N+1];

        for(int i = 1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++) {
                D[i][j] = D[i-1][j] + D[i][j-1] +  Integer.parseInt(st.nextToken()) - D[i-1][j-1];
            }
        }

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
        }


    }
}
