/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.
*/
class Solution 
{
    public static void convertToWave(int n, int[] a) 
    {
        // code here
        if(n>1)
        {
        for(int i=0;i<n-1;i+=2)
        {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        }
    }
}