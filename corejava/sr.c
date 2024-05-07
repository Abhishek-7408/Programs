#include <stdio.h>
 struct union1{
 int a;
 long long b;
 char c;
 };
 int main() {
 printf("%d",sizeof(struct union1));
 return 0;
 }