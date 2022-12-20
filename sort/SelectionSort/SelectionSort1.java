package SelectionSort;

public class SelectionSort1 {
    public static void selection_sort(int list[], int n) {
        int i, j, least, temp;
        for(i = 0; i<n-1; i++) {
            least = i;
            for(j = i+1; j<n; j++){
                if(list[j] < list[least]) least = j;
            }
            temp = list[i];
            list[i] = list[least];
            list[least] = temp;
        }
    }

    public static void insertion_sort(int list[], int n) {
        int i,j,key;

        for(i = 1; i<n; i++) {
            key = list[i];
            for(j = i-1; j >= 0 && list[j] > key; j--)
                list[j+1] = list[j];
            list[j + 1] = key;
        }
    }

    public static void bubble_sort(int list[], int n) {
        int i,j,temp;

        for(i = n-1; i>0; i--) {
            for(j = 0; j<i; j++) {
                if(list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
    static int sorted[] = new int[10];
    public static void merge(int list[], int left, int mid, int right) {
        int i, j, k, l;
        i = left; j = mid+1; k = left;

        while (i <= mid && j <= right) {
            if(list[i] <= list[j]) sorted[k++] = list[i++];
            else sorted[k++] = list[j++];
        }

        if(i > mid) {
            for(l = j; l<=right; l++) sorted[k++] = list[l];
        }
        else {
            for(l = i; l<=mid; l++) sorted[k++] = list[l];
        }

        for(l=left; l<=right; l++) list[l] = sorted[l];
    }
    public static void merge_sort(int list[], int left, int right) {
        int mid;

        if(left<right) {
            mid = (left+right)/2;
            merge_sort(list, left, mid);
            merge_sort(list, mid+1, right);
            merge(list, left, mid, right);
        }
    }

    public static void main(String[] arg) {
        int i;
        int n = 10;
        int list[] = new int[n];
        for(i=0; i<n; i++)
            list[i] = (int)(Math.random() * 100);

        bubble_sort(list,n);

        for (i = 0; i<n; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
