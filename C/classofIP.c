#include <stdio.h>
int main(){
char arr[50];
scanf("%s",&arr);
int num=0;
int i=0;
while(arr[i]!='.'){
    int r = arr[i]-'0';
    num = num*10+r;
    i++;
}
if(num>=0 && num<=127){
    printf("Class of A IP Address");
}
else if(num>=)










    return 0;
}