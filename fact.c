#include<stdio.h>
void fact(int n);
main()
{
  int i,n,fact=1;
   printf("enter no :");
  scanf("%d",&n);
  fact(n);
}
void fact(int n)
{
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  printf("\n fact=%d",fact);
}
