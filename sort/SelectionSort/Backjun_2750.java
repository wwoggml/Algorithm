package SelectionSort;

import java.util.Scanner;

public class Backjun_2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int list[] = new int[n];

        int i,j,temp;

        for(i = 0; i<n; i++) {
            list[i] = scanner.nextInt();
        }

        for(i = 0; i<n-1; i++) {
            for(j = i+1; j<n; j++) {
                if(list[j] < list[i]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        for (i = 0; i<n; i++) {
            System.out.println(list[i]);
        }
    }
}
