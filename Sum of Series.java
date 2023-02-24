/*
Sum of Series
Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
*/

class Solution 
{
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) 
    {
        // code here
            
        if(n%2==0)
        {
            long sum=((long)n/2)*(1+(long)n);
            return sum;
        }
        else
        {
            long sum;
            sum=1+(long)n;
            sum=sum/2;
            sum=sum*(long)n;
            return sum;
        }
    }
}