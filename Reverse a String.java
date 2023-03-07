/*
Reverse a String
*/





class Solution 
{
    static String revStr(String S) 
    {
        // code here
        char ch;
        String nstr="";
        for (int i=0; i<S.length(); i++)
        {
            ch= S.charAt(i);
            nstr= ch+nstr;
        }
        return nstr;

    }
}