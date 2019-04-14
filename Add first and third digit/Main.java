#include<stdio.h>
int main()
{
  //Type your code here
  int num1;
  scanf("%d",&num1);
  int f=num1/100;
  int t=num1%10;
  printf("%d",t+f);
  return 0;
}