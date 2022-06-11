public class Knapsack {
    public static void main(String[] args) {
        int p[] = {0, 1, 2, 5, 6};
        int wt[]={0, 2, 3, 4, 5 };

        int m=8; //capacity of the knapsack
        int n=4; //no.of elements
        int k[][] = new int[5][9];

        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if(i==0 || j==0)
                {
                    k[i] [j]=0;

                }
                else if(wt[i]<=j)
                {
                    k[i][j]= Math.max(p[i]+k[i-1][j-wt[i]], k[i-1][j]);
                }
                else
                {
                    k[i][j]=k[i-1][j];
                }
                System.out.print(k[n][j]);                                 
            }
            System.out.println();
        }
    }
}
