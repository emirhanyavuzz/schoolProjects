#include <stdlib.h>
#include<stdio.h>
#include<math.h>
#include<stdbool.h>
#include<time.h>

int main() {
    
	int x ;
    
    int givenInput=0;
    printf("Enter a number:");
    scanf("%d",&givenInput);
    for(int x=givenInput;x>=1;x--){
        int counter=0;
        for(int i=x;i>1;i--)
        {
            if(x%i==0){
                counter= counter + x/i;
            }
        
        }
            //printf("sum of %d's factors is \t%d\n",x,counter);
            //printf("%d\n",counter);
        if(counter==x){
            printf("%d is perfect number\n",x);
        }
        if(counter==1){
            printf("%d is prime number\n",x);
        }
    }
        return 0;
}