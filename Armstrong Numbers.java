/*
Armstrong Numbers
or a given 3 digit number, find whether it is armstrong number or not.
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
Return "Yes" if it is a armstrong number else return "No".
*/

class Solution 
{
    static String armstrongNumber(int n)
    {
        // code here
        int sum=0;
        String str="";
        int n1=n;
        int r=n%10;
        sum=sum+r*r*r;
        n=n/10;
        r=n%10;
        sum=sum+r*r*r;
        n=n/10;
        r=n%10;
        sum=sum+r*r*r;
        if(n1==sum)
            str="Yes";
        else
            str="No";
        return str;
    }
}