/*
Given a non-negative integer s represented as a string, count the number of digits in s that divide the number represented by s.

A digit is considered valid only if it is non-zero and the number represented by s is divisible by that digit.

If a digit appears multiple times in s, each occurrence should be counted separately.

Examples:

Input: s = "35"
Output: 1
Explanation: The digit 5 divides 35, but the digit 3 does not. So the answer is 1.
Input: s = "1122324"
Output: 7
Explanation: Every digit in "1122324" divides 1122324. So the answer is 7.

Constraints:
1 ≤ |s| ≤ 106

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)

*/



class Solution {
 public:
     int divisibleByDigits(string& s) {
         int c = 0;

         int rem[10] = {0};

         for (int i = 0; i < s.length(); i++) {
             int digit = s[i] - '0';

             for (int d = 1; d <= 9; d++) {
                 rem[d] = (rem[d] * 10 + digit) % d;
             }
         }

         for (int i = 0; i < s.length(); i++) {
             int d = s[i] - '0';

             if (d != 0 && rem[d] == 0) {
                 c++;
             }
         }

         return c;
     }
 };
