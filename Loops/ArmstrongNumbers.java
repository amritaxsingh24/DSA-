/* 
Given a positive integer n, determine whether it is an Armstrong number or not.

An Armstrong number is a number where, sum of each digit raised to the power digit count, is equal to the original number.

Examples:

Input: n = 153
Output: true
Explanation: 13 + 53 + 33 = 153, which is equal to the original number.
Input: n = 1634
Output: true
Explanation: 14 + 64 + 34 + 44 = 1634, which is equal to the original number.
Input: n = 100
Output: false
Explanation: 13 + 03 + 03 = 1, which is not equal to 100.
Constraints:

1 ≤ n < 106
*/ 


class Solution {
    public boolean armstrongNumber(int n) {
        int ans = 0;
        int original = n;
        int count = 0;
        int temp = n;

        while(temp > 0){
            count++;
            temp /= 10;
        }

        while(original > 0){
            int digit = original % 10;
            original /= 10;

            ans = ans + (int)Math.pow(digit, count);
        }
     
        return(n == ans);
    }
}
