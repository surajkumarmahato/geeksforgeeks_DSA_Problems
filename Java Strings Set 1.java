/*
Java Strings | Set 1
Given two strings S1 and S2 as input. 
Your task is to concatenate two strings and then reverse the string. 
Finally print the reversed string.
*/

class Solution 
{
    static String conRevstr(String S1, String S2) 
    {
        // code here
        String str=S1+S2;
        StringBuffer sb=new StringBuffer(str);
        String rev=sb.reverse().toString();
        return rev;
    }
}