#include <stdio.h>
int main(){
    int n,i,sum=0,expected_sum;
    int arr[n];
    scanf("%d",&n);
    for(int i=0;i<n-1;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }

    expected_sum = (n*(n+1))/2;
    printf("%d Missing numberis\n",expected_sum-sum);
    return 0;
}