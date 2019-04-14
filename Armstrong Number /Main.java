#include <stdio.h>
int main() {
	//Type your code
  int n,temp,power,rem,cube,sum;
  power=0;
  sum=0;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    n=n/10;
    power++;
  }
  n=temp;
  while(temp>0)
  {
    rem=temp%10;
    cube=pow(rem,power);
    sum+=cube;
    temp=temp/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}