import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int array[] = new int[N];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        for(int k = 0; k<N; k++) {
            long find = array[k];
            int i = 0, j = N-1;

            while (i<j) {
                if(array[i] + array[j] == find) {
                    if( i != k && j != k){
                        count++;
                        break;
                    }
                    else if(i == k) i++;
                    else if(j == k) j--;
                }
                else if(array[i] + array[j] < find) i++;
                else j--;
            }
        }

        System.out.println(count);
    }
}
