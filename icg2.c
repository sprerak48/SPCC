#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char sw[10][30],ex[30];
int ch,i,j,n,indx;

int main()
{
	printf("\n Enter the conditional statements");
	scanf("%s",ex);
	printf("\n Enter lines of codes in loop :");
	scanf("%d",&n);
	printf("\n Enter the code:");
	for(i=0;i<n;i++)	
		scanf("%s",sw[i]);
	
	indx=100;
	i=1;
	printf("\n Translation scheme for while %s do ... is",ex);

	printf("\n %d . L%d: if %s goto L%d",indx++,i,ex,i+1);
	printf("\n %d . goto Last",indx++);
	printf("\n %d . L%d: %s",indx++,i+1,sw[0]);
	for(j=1;j<n;j++)
		printf("\n %d . %s",indx++,sw[j]);
	printf("\n %d . goto L%d",indx++,i);
	printf("\n %d . Last \n",indx++);

}
