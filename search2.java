
public class search2 {
    public static void findTriplet(int arr[], int size, int value) {
        for (int i = 0; i < (size - 2); i++)
        for (int j = i + 1; j < (size - 1); j++)
        for (int k = j + 1; k < size; k++) {
        if ((arr[i] + arr[j] + arr[k]) == value)
        System.out.println("Triplet :: " + arr[i] + arr[j] + arr[k]);
        }
        }
        
        
   public static void main(String[] args) {
    int[] arr={1,4,-3,5,2};
    findTriplet(arr,arr.length,7);
   } 
}
