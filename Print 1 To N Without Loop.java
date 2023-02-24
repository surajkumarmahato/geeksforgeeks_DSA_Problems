/*
Print 1 To N Without Loop
Print numbers from 1 to N without the help of loops.
*/

class Solution
{
    int c=1;
    
  public void printNos(int N)
    {
        //Your code here
        if(N==0)
            return;
        System.out.print(c+" ");
        c++;
        printNos(N - 1);
    }
}