/*
Perfect Arrays
Given an array of size N and you have to tell whether the array is perfect or not.
An array is said to be perfect if its reverse array matches the original array.
If the array is perfect then return True else return False.
*/

class Solution
{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        int c=0;
        int temp;
        temp=n/2;
        int l=a.length-1;
        for(int i=0;i<=temp;i++)
        {
            if(a[i]==a[l-i])
                c++;
        }
        if(n%2==0)
        {
            if(temp==c)
            return true;
        else
            return false;
        }
        else
        {
            if(temp==c-1)
            return true;
        else
            return false;
        }
        
    }
    
}