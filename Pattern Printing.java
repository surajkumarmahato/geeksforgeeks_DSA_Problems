/*
Pattern Printing
Given a number N. The task is to print a series of asterisk(*) from 1 till N terms with increasing order and difference being 1.
*/
class Solution
{
    static void printPattern(int N)
    {
        // code here
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}