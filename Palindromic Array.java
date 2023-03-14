/*
Palindromic Array
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. 
Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
*/

class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int c=0,n1;
                  
                  for(int i=0;i<n;i++)
                  {
                      n1=a[i];
                      int rev = 0;
                    int rem;
                    while(n1>0)
                    {
                          rem = n1%10;
                          rev = (rev*10) + rem;
                          n1 = n1/10;
                    }
                   if(a[i]==rev)
                      c++;
                  }
                 if(c==n)
                    return 1;
                else
                    return 0;
           }
}