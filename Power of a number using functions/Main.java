#include<stdio.h>

int calculate_power(int b,int e)
{
  int pwr=1;
  while(e>0)
  {
    pwr=pwr*b;
    e--;
  }
  return pwr;
}
int main(){
    // Type your code here
  int b,e,result;
  scanf("%d %d",&b,&e);
  result=calculate_power(b,e);
  printf("%d",result);
  	return 0;
}