/*
Reverse digits
Given N,  reverse the digits of N.
*/

class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long digit=0;
        long r;
        while(n>0)
        {
            r=n%10;
            digit=digit*10+r;
            n=n/10;
        }
        return digit;
    }
}
