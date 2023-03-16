/*
Swap kth elements
Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.
*/
class Solution 
{
    void swapKth(int arr[], int n, int k) 
    {
        // code here
        int temp = arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
    }

}