#include<stdio.h>
int isprime(int i)
{
  int j;
  for(j=2;j<i;j++)
  {
    if((i%j)==0)
      return 0;
  }
  return 1;
}
int main(){
    // Type your code here
  int n,i;
  scanf("%d",&n);
  printf("%d\n",2);
  for(i=3;i<=n;i++)
  {
    if(isprime(i)==1)
      printf("%d\n",i);
  }

    return 0;
}