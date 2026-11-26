/*
Given a positive number n, print the string "GFG" exactly n times separated by a single space.

Examples:

Input: n = 5
Output: GFG GFG GFG GFG GFG
Explanation: The string "GFG" is printed 5 times, with each instance separated by a space.
Input: 3
Output: GFG GFG GFG
Explanation: The string "GFG" is printed 3 times separated by spaces.
Constraints:

1 ≤ n ≤ 103
*/



class Solution {
    void printGfg(int n) {
        // code here
        if(n == 0){
            return;
        }
        printGfg(n -1);
        System.out.print("GFG"+" ");
    }
}
