#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int temp,sum=0;
  while(n>0)
  {
    temp=n%10;
    sum=sum+temp;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}