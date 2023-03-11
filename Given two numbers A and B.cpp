/*
Given two numbers A and B. 
Perform addition,multiplication, subtraction and division on these two numbers.
*/
class Solution 
{
  public:
    vector<int> cppOperators(int A, int B) 
{
        // code here
        vector<int>vec;
        vec.push_back(A+B);
        vec.push_back(A*B);
        vec.push_back((A>B) ? A-B : B-A);
        vec.push_back((A>B) ? A/B : B/A);
        
        return vec;
    }
};