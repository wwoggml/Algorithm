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

        for(int i = 0; i<P; i++) {
            Add(dna[i]);
        }

        if(check == 4) count++;

        for(int i = P; i<S; i++) {
            int j = i-P;
            Add(dna[i]);
            Remove(dna[j]);
            if(check == 4) count++;
        }

        System.out.println(count);
    }

    static void Add(char c) {
        switch (c) {
            case 'A':
                current_array[0]++;
                if(current_array[0] == check_array[0]) check++;
                break;
            case 'C':
                current_array[1]++;
                if(current_array[1] == check_array[1]) check++;
                break;
            case 'G':
                current_array[2]++;
                if(current_array[2] == check_array[2]) check++;
                break;
            case 'T':
                current_array[3]++;
                if(current_array[3] == check_array[3]) check++;
                break;
        }
    }

    static void Remove(char c) {
        switch (c) {
            case 'A':
                if(current_array[0] == check_array[0]) check--;
                current_array[0]--;
                break;
            case 'C':
                if(current_array[1] == check_array[1]) check--;
                current_array[1]--;
                break;
            case 'G':
                if(current_array[2] == check_array[2]) check--;
                current_array[2]--;
                break;
            case 'T':
                if(current_array[3] == check_array[3]) check--;
                current_array[3]--;
                break;
        }
    }
}
