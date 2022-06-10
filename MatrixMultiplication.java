public class MatrixMultiplication {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {2, 3, 4, 5, 6 };
        MatrixChainMul(arr, n);
        
    }
    public static void MatrixChainMul(int arr[], int n) {
        int a[][] = new int[n][n];
        int min, q, d;

        for (int i = 0; i < a.length; i++) {
            a[i][i]=0;
                        
        }

        for(d=2; d<n; d++){
            for (int i = 1; i < n-d; i++) {
                int j= i+d;
                if(j==n) 
                    continue;
                    
                min = Integer.MAX_VALUE;
                for (int k = i; k <=j-1; k++) {
                    q = a[i][k] + a[k+1] [j] + arr[k]*arr[j]*arr[i-1];

                    if(q<min)
                    min = q;


                }
                a[i][j]=min;
                
            }
        }

         System.out.println("Minimum number of multiplications required are: "+a[1][n-1]);
    }
}
