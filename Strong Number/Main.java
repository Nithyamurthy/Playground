#include <stdio.h>
int fact(int a)
{
  int i,facto;
  facto=1;
  for(i=1;i<=a;i++)
    facto*=i;
  return facto;
}
int main() {
	//Type your code
  int n,totdigits,i,rem,sum;
  sum=0;
  scanf("%d",&n);
  int temp=n;
  while(n>0)
  {
    n=n/10;
    totdigits++;
  }
  n=temp;
 while(totdigits>0)
 {
   rem=n%10;
   sum+=fact(rem);
   n=n/10;
   totdigits--;
 }
  if(sum==temp)
    printf("Yes");
  else
    printf("No");
 
  
  
	return 0;
}