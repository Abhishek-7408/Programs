#include<stdio.h>
 struct student
 {
 char name[50];
 int roll;
 char grade;
 int marks[3];
 float avg;
 };
 int main()
 {
 struct student stu;
 stu={.marks[0]=88,.marks[1]=87,.marks[2]=90};
 printf("%d",stu.marks[2]);
 printf("%d",stu.marks[1]);
 printf("%d",stu.marks[0]);
return 0;
 }