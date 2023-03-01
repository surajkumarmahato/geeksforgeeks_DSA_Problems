/*
Small Factorial
Calculate factorial of a given number N.
*/

class Solution
{
    public long find_fact(int n)
    {
        // Code here
        long val=1;
        for(int i=1;i<=n;i++)
        {
            val*=i;
        }
        return val;
    }
}