#include <stdio.h>
int main() {
	//Type your code
  int n,fact=1;
  scanf("%d",&n);
  int i;
  for(i=1;i<=n;i++)
    fact*=i;
  printf("%d",fact);
	return 0;
}