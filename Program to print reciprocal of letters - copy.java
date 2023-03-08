/*
Program to print reciprocal of letters - copy
Participate in Monthly Hiring Challenge conducted by GeeksforGeeks !!  

Given a string S, we need to find reciprocal of it. 
The reciprocal of the letter is found by finding the difference between the position of the letter and the first letter ‘A’.
Then decreasing the same number of steps from the last letter ‘Z’. The character that we reach after above steps is reciprocal.
Reciprocal of Z is A and vice versa because if you reverse the position of the alphabet A will be in the position of Z.
Similarly, if the letter is a small case then the first letter will be 'a' and the last letter will be 'z'. 
and the definition of reciprocal remains the same.
*/
class Solution
{
    static String reciprocalString(String S)
    {
        
        // code here
        String str="";
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<S.length();i++)
        {
            int ch=S.charAt(i);
            if(ch>='a' && ch<='z')
            {
                str=String.valueOf((char)('a'+'z'-ch));

            }
            else if(ch>='A' && ch<='Z')
            {
                str=String.valueOf((char)('A'+'Z'-ch));
            }
            else
            {
                str=" ";
            }
            sb.append(str);
        }
        str=sb.toString();
        return str;
    }
}