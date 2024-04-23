#include <stdio.h>
struct date{
    int d,m,y;
};
void main()
{
    struct date today,d1;
    today.d=26;
    today.m=02;
    today.y=2024;
    d1.d=today.d;
    d1.m=today.m;
    d1.y=today.y;
    d1 = today;
    printf("Enter Today date");
    scanf("%d/%d/%d",&d1.d,&d1.m,&d1.y);
    printf("Date %d %d %d",d1.d,d1.m,d1.y);


    
}
