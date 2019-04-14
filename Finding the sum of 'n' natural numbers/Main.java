#include <stdio.h>
int sum(int n);
int main(int argc, char *argv[])
{
  int n,factor;
  scanf("%d",&n);
    factor=sum(n);
  printf("%d",factor);
  return 0;
}
int sum(int n)
{
  if(n==1)
    return 1;
  else
    return(n+sum(n-1));
}