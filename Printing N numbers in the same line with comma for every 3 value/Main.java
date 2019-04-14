#include <stdio.h>
int main() {
	//Type your code
  int n,i,count;
  scanf("%d",&n);
  count=0;
  for(i=1;i<=n;i++)
  {
    printf("%d",i);
    count++;
    if((count%3)==0 && count!=0)
      printf(",");
  }
  
	return 0;
}