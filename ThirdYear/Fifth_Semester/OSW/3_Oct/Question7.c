#include<stdio.h>

int main(){
	int num;
	printf("Enter A Number \n");
	scanf("%d",&num);
	num = num/10;
	switch(num)
	{	
		case 10:
		{
			printf("O");
			break;
		}
		case 9:
		{
			printf("A");
			break;
		}
		case 8:
		{
			printf("B");
			break;
		}
		case 7:
		{
			printf("C");
			break;
		}
		case 6:
		{
			printf("D");
			break;
		}
		case 5:
		{
			printf("E");
			break;
		}
		case 4:{
			printf("F");
			break;
		}default:{
			(num>=0&&num<=10)?printf("Marks Less than 40 \n"):printf("Invalid Input ");
			break;
		}
	}
	return 0;
}
