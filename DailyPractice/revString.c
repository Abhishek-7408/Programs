#include <stdio.h>
#include <string.h>
int main(){

char str[]= {'a','b','c','d','e','f'};
int l = strlen(str);

for(int i=0;i<l/2;i++){

int temp = str[i];
str[i] = str[l-1-i];
str[l-1-i] = temp;

}
for(int i=0;i<l;i++){
    printf("%c",str[i]);
}



return 0;
}