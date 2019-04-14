#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j=0;
  scanf("%d",&n);
  printf("*\n");
  int count=1;
  for(i=1;i<n;i++)
  {
    for(j=0;j<=i;j++)
    {
      if((count%2)==0)
      {
        printf("*");
        count++;
      }
      else
      {
        printf("#");
        count++;
      }
 
    }
    printf("\n");
  }
  	return 0;
}