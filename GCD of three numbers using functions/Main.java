#include <stdio.h>
int gcd(int a,int b)
{
  int min,gcds;
  if(a<b)
    min=a;
  else
    min=b;
  while(min>=1)
  {
    if(((a%min)==0) && ((b%min)==0))
    {
      gcds=min;
      break;
    }
    min--;
  }
  return gcds;
}
int main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int res1=gcd(n1,n2);
  int res=gcd(res1,n3);
  printf("%d",res);
	return 0;
}