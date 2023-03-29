import java.util.List;

public class Sorting {
    final static int MAX_SIZE = 10;

    public static void SelectionSort(int[] a) {
        int min, temp;

        for(int i = 0; i<MAX_SIZE-1; i++) {
            min = i;
            for(int j = i+1; j<MAX_SIZE; j++) {
                if(a[j] < a[min]) min = j;
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

    }

    public static void InsertionSort(int[] list) {
        int key, i, j;
        for(i = 1; i<MAX_SIZE; i++) {
            key = list[i];
            for(j = i-1; j>=0 && list[j] > key; j--)
                list[j+1] = list[j];
            list[j+1] = key;
        }
    }

    public static void BubbleSort(int[] list) {
        int i, j, temp;
        for(i = MAX_SIZE-1; i>0; i--) {
            for(j = 0; j<i; j++) {
                if(list[j] > list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {30,40,10,32,50,20,2,4,3,90};

        for(int i = 0; i<MAX_SIZE; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        BubbleSort(array);

        for(int i = 0; i<MAX_SIZE; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
