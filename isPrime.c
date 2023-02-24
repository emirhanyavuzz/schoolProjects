#include<stdio.h>
#include<math.h>
#include <stdbool.h>
int main (){
int x;
int isPrime=1;
scanf("%d",&x);
for (int i = 2; i <= sqrt(x); i++)
{
   
        if( x%i ==0){
            isPrime=0;           
        }         
             
}
   
if(isPrime==1)
    printf("%d is prime",x);
else if (isPrime==0)
    printf("%d is not prime",x);


    return 0 ;
}

                

