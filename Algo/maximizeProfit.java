import java.util.Scanner;

public class maximizeProfit {

    public static int knapsack(int N , int[] weights,int[] profits,int W){
int dp[][] = new int[N+1][W+1];
for(int i=0;i<=N;i++){
    for(int w = 0;w<=W;w++){
     if(i==0 || w==0){
        dp[i][w] = 0;

     }

     else if(weights[i-1] <=W){
        dp[i][w] = Math.max(profits[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);

     }
     else {
        dp[i][w] = dp[i - 1][w];
     }
    }
}

return dp[N][W];


    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] weights = new int[N];
        int [] profits = new int[N];

        for(int i=0;i<N;i++){
            weights[i] = sc.nextInt();
            profits[i] = sc.nextInt();


        }

        int W = sc.nextInt();
        knapsack(N, weights, profits, W);
    }
}
