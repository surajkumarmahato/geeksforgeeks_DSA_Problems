/*
Even Odd Sum
*/

class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) 
    {
        // code here
        int odd=0;
        int even=0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(i%2==0)
                even=even+Arr[i];
            else
                odd=odd+Arr[i];
        }
        al.add(even);
        al.add(odd);
        return al;
        
    }
}