package SelectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjun_2750 {
    static int sorted[];
    public static void merge(int list[], int left, int mid, int right) {
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;

        while (i <= mid && j <= right) {
            if (list[i] <= list[j])
                sorted[k++] = list[i++];
            else
                sorted[k++] = list[j++];
        }

        if (i > mid) {
            for (l = j; l <= right; l++)
                sorted[k++] = list[l];
        }
        else {
            for (l = i; l <= mid; l++)
                sorted[k++] = list[l];
        }
        for(l = left; l<=right; l++) {
            list[l] = sorted[l];
        }
    }


    public static void merge_sort(int list[], int left, int right){
        int mid;
        if(left < right) {
            mid  = (left + right) / 2;
            merge_sort(list,left,mid);
            merge_sort(list,mid+1,right);
            merge(list,left,mid,right);
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int list[] = new int[n];
        sorted = new int[n];

        for(int i = 0; i<list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(list,0,list.length-1);

        for(int i = 0; i<list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
