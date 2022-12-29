import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_12891 {
    static int[] check_array;
    static int[] current_array;
    static int check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int count = 0;
        char[] dna = new char[S];
        check_array = new int[4];
        current_array = new int[4];
        check = 0;

        dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++) {
            check_array[i] = Integer.parseInt(st.nextToken());
            if(check_array[i] == 0) check++;
        }

        int start_index = 0;
        int end_index = start_index + P-1;

        while (end_index < S) {
            for(int i = start_index; i<=end_index; i++) {
                if(dna[i] == 'A') current_array[0]++;
                else if(dna[i] == 'C') current_array[1]++;
                else if(dna[i] == 'G') current_array[2]++;
                else current_array[3]++;
            }

            for(int i = 0; i<4; i++) {
                if(check_array[i] == current_array[i]) check++;
                current_array[i] = 0;
            }
            if(check == 4) count++;
            start_index++;
            end_index = start_index + P-1;
            check = 0;
        }

        System.out.println(count);
    }
}
