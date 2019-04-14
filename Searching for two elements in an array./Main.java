#include<stdio.h>
int main()
{
  //Type your code here
  int arrsize,i,ele1,ele2;
  scanf("%d",&arrsize);
  int arr[arrsize];
  for(i=0;i<arrsize;i++)
    scanf("%d",&arr[i]);
  scanf("%d %d",&ele1,&ele2);
  int index1=-1,index2=-1;
  for(i=0;i<arrsize;i++)
  {
    if(arr[i]==ele1)
    {
      index1=i;
      
    }
  if(arr[i]==ele2)
  {
    index2=i;
      
  }
  }
  printf("%d\n",index1);
  printf("%d\n",index2);
  return 0;
}