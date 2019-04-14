#include<stdio.h>
int main()
{
  //Type your code here
  int num1,d1,d2;
  scanf("%d",&num1);
  d1=num1%10;
  d2=(num1%100)/10;
  printf("%d",d1+d2);
  return 0;
}