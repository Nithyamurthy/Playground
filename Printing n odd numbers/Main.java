#include <stdio.h>
int main() {
	//Type your code
  int n,i,count;
  scanf("%d",&n);
  count=1;
  for(i=1;;i++)
  {
    if(count<=n)
    {
      if((i%2)!=0)
      {
        printf("%d\n",i);
        count++;
      }
    }
    else
    {
      break;
    }
  }
   
  
    
  
	return 0;
}