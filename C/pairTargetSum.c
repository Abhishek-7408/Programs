#include <stdio.h>
int main(){
    int n,t;
    scanf("%d",&n);
    scanf("%d",&t);
    int arr[n];
    int i,j;
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    int count =0;
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]+arr[j]==t){
                count++;
            }
        }
    }
    printf("%d",count);
    
}