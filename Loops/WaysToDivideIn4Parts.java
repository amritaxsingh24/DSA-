/*
Given a positive integer n, count the number of ways to represent n as the sum of four positive integers.

In each representation: a + b + c + d = n
where: a > 0, b > 0, c > 0, d > 0
Return the total number of such representations.

Examples:

Input: n = 5
Output: 1
Explanation: The only possible representation is: 1 + 1 + 1 + 2 = 5. Therefore, the answer is 1.
Input: n = 41
Output: 511
Explanation: There are 511 different ways to represent 41 as the sum of four positive integers. Therefore, the answer is 511.
Constraints:
0 ≤ n ≤ 100
*/



class Solution {
    public int countWays(int n) {
        int count = 0;
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                for(int c = 1; c <= n; c++){
                    int d = n - (a + b + c);
                        if((a <= b) && (b <= c) && (c<= d)){
                            if(a + b + c + d == n){
                                count++;
                            }
                        }
                    
                }
            }
                
        }
        return count;
    }
}
