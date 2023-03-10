/*
The dice problem
You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. 
The numbers are in the range of 1 to 6, like any ordinary dice. 
You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.
*/

class Solution
{
    static int oppositeFaceOfDice(int N)
    {
        // code here
        if(N==1)
            return 6;
        else if(N==2)
            return 5;
        else if(N==3)
            return 4;
        else if(N==4)
            return 3;
        else if(N==5)
            return 2;
        else
            return 1;
    }
}