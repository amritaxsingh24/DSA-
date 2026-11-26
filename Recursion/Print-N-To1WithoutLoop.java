/*
Given an integer n, print all numbers from n to 1 in decreasing order, separated by spaces, without using any loops.

Examples :

Input: n = 5
Output: 5 4 3 2 1
Explanation: The numbers from 5 to 1 are printed in decreasing order.
Input: n = 3
Output: 3 2 1
Explanation: The numbers from 3 to 1 are printed in decreasing order
Constraints:

1 ≤ n ≤ 103
*/
 


class Solution {
    public void printNos(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printNos(n-1);
        return;
    }
}
