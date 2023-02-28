/*
Multiplication Table
*/

class Solution
{
    static ArrayList<Integer> getTable(int N)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            al.add(i*N);
        }
        return al;
    }
}