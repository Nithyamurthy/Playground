#include <stdio.h>
int main() {
	// Type your code here
  int i,j,N;
  int count;
  scanf("%d",&N);
  count=N;
  for(i=1;i<=N;i++)
  {
    for(j=1;j<=N;j++)
    {
      if(j==i||(j==count-i+1))
        printf("*");
        else
          printf(" ");
    }
    printf("\n");
  }
	return 0;
}