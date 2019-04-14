#include<stdio.h>
int main()
{
	//Try out your code here
  int arrsize,i,j;
  scanf("%d",&arrsize);
  int arr[arrsize];
  for(i=0;i<arrsize;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<arrsize;i++)
  {
    for(j=i+1;j<arrsize;j++)
    {
      if(arr[i]<arr[j])
        printf("%d,%d\n",arr[i],arr[j]);
    }
    
  }
	return 0;
}