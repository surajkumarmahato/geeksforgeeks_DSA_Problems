/*
C++ if-else (Decision Making)
Given an integer N. 
Your task is to check if the integer is greater than, less than or equal to 5.
If the integer is greater than 5, then print "Greater than 5" (without quotes).
If the integer is less than 5, then print "Less than 5".
If the integer is equal to 5, then print "Equal to 5".
*/
class Solution
{   
public:
    string compareFive(int n)
{
        // code here
         
        if(n>5)
        cout<<"Greater than 5";
        else if(n<5)
        cout<<"Less than 5";
        else
        cout<<"Equal to 5";
    }
};