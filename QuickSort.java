import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {23, 12, 45, 67, 22, 4};
        int n = arr.length;

        QS(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));


    }
    private static void QS(int[] arr, int start, int end) {
        if(start>=end)
        {
            return;
        }

        int s = start;
        int e = end;

        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }

            if(s<=e)
            {
                swap(arr, s, e);
                s++;
                e--;

            }
            QS(arr, start, e);
            QS(arr, s, end);
        }

    }
    private static void swap(int[] arr, int start, int e) {
        int temp;
        temp = arr[start];
        arr[start] = arr[e];
        arr[e] = temp;

    }
}
