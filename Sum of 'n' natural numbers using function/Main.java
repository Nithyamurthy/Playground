#include<stdio.h>
int fndsum(int n)
{
  int i,sum=0;
  for(i=1;i<=n;i++)
    sum+=i;
  return(sum);
}
  
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  printf("%d",fndsum(n));
  	return 0;
}