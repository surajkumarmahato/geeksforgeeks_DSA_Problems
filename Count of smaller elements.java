/*
Count of smaller elements
Given an sorted array A of size N. 
Find number of elements which are less than or equal to given element X.
class Compute 
{
    
    public long countOfElements(long arr[], long n, long x)
    {
        long c=0;
       for(int i=0 ; i<n ; i++)
       {
           if(arr[i]<=x)
            {
                c++;
            }
       }
       return c;
        
    }
}