package SelectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int answer = 0;
        int A[] = new int[100001];
        int S[] = new int[100001];

        for(int i = 0; i<10000; i++) {
            A[i] = (int)(Math.random() * Integer.MAX_VALUE);
            S[i] = S[i-1] + A[i];
        }

        for(int t =1; t<testcase; t++) {
            int query = Integer.parseInt(br.readLine());
            for(int i = 0; i<query; i++) {
                int start = Integer.parseInt(br.readLine());
                int end = Integer.parseInt(br.readLine());
                answer += S[end] - S[start-1];
                System.out.println(testcase + " " + answer);
            }
        }
    }
}
