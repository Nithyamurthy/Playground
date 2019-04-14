#include<stdio.h>
int fact(int n);
int main()
{
	//Try out your code here
  int n,factor;
  scanf("%d",&n);
    factor=fact(n);
  printf("%d",factor);
	return 0;
}
int fact(int n)
{
  if(n==0)
    return 1;
  else
    return(n*fact(n-1));
}
