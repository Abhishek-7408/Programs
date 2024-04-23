#include <stdio.h>
int main(){
    add();
    isEven();

}
add() {
    int a,b,s;
    printf("Enter Numbers: ");
    scanf("%d\n %d",&a,&b);
    s = a+b;
    printf("%d\n",s);
     
}
isEven(){
    int a;
    printf("Enter Numbers: ");
    scanf("%d",&a);


    if(a%2==0)
        printf("Even");
    else
        printf("Odd");
    
}