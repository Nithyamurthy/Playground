#include<stdio.h>
int main()
{
//Try out your code here
  int n,i,j,count;;
  scanf("%d",&n);
  count=n;
  for(i=0;i<n;i++)
  {
    count=n-i;
    for(j=1;j<=n-i;j++)
    {
      printf("%d",count);
      count--;
    }
    printf("\n");
  }
return 0;
}