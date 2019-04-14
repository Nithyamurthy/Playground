#include <stdio.h>
int main() {
	//Type your code
  int sum,n,i;
  scanf("%d",&n);
  sum=0;
  for(i=0;i<=n;i++)
  {
    sum+=i;
  }
  printf("%d",sum);
	return 0;
}