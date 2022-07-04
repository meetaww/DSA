
public class search1 {
  public static void OddCount(int[] arr, int size) {
    int xorSum = 0;
    int first = 0;
    int second = 0;
    int setBit;
    for (int i=0; i<size; i++) 
    xorSum= xorSum^arr[i];
    setBit = xorSum&~(xorSum-1);
    for (int i =0; i < size; i++) {
    if ((arr[i] & setBit)!=0)
    first^=arr[i];
    else
    second^=arr[i];
    }
    System.out.println(first+" "+second);
    }
	public static void main (String[] args) 
	{
		int arr[] = {1,1,2,2,2,3,3,4,4,4};
        System.out.println("the element which appear odd number of times: ");
		OddCount(arr,5);
	}
}



