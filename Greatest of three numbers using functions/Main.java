#include <stdio.h>
int max2(int a,int b)
{
  if(a>b)
    return a;
  else
    return b;
}
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int max=max2(n1,n2);
  if(max>n3)
    printf("%d",max);
  else
    printf("%d",n3);
  	return 0;
}