/*
Smaller and Larger Number
Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X.
*/

class Solve 
{
    int[] getMoreAndLess(int[] arr, int n, int x) 
    {
        // code here
        int c1=0,c2=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]<=x)
                c1++;
            if(arr[i]>=x)
                c2++;
       }
       int[] arr1 = new int[2];
       arr1[0]=c1;
       arr1[1]=c2;
       return arr1;
    }
}
}