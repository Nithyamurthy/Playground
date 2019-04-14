#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int last=n%10;
  int first=n;
  while(n>=10)
  {
    n=n/10;
  }
  first=n;
  printf("%d",first+last);
  

	return 0;
}