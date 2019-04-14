#include<stdio.h>
int main()
{
  //Type your code here
  int arrsize,i;
  scanf("%d",&arrsize);
  int arr[arrsize];
  for(i=0;i<arrsize;i++)
    scanf("%d",&arr[i]);
  int count=1;
  for(i=0;i<arrsize;i++)
    if(arr[i]==1 && arr[i+1]==1)
      count++;
  if(count==1)
    printf("%d",0);
    else
      printf("%d",count);
  return 0;
}

