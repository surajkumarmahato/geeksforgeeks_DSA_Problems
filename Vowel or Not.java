/*
Vowel or Not
Given a English alphabet c, Write a program to check whether a character is a vowel or not.
*/

class Solution
{
    String isVowel(char c)
    {
        // code here
        String str="";
        if(c=='a' || c=='e' || c=='i' || c=='o'  ||c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            str="YES";
        else
            str="NO";
        return str;
    }
}
