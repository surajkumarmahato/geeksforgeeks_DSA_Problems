/*
Count pairs with given sum
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
*/
class Solution 
{
    int getPairsCount(int[] arr, int n, int k) 
    {
        // code here
        HashMap<Integer,Integer> map =new  HashMap<>();
        int ans = 0;
        for(int i : arr)
        {
            ans = ans + map.getOrDefault(k - i,0);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return ans;
    }
}