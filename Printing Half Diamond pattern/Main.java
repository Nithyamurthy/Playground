#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j,k,count=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=(n-i);j++)
    {
      printf(" ");
    }
    for(k=1;k<=count;k++)
    {
      printf("*");
    }
    count+=2;
    printf("\n");
  }
	return 0;
}