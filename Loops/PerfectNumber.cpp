/*
Given a number N. Check if it is perfect or not. A number is perfect if sum of factorial of its digit is equal to the given number.

Example 1:

Input: N = 23
Output: 0
Explanation: The sum of factorials of 
digits of 23 is 2! + 3! = 2 + 6 = 8 
which is not equal to 23. Thus, answer 
is 0.
Example 2:

Input: N = 145
Output: 1
Explanation: The sum of factorials of digits 
of 145 is 1! + 4! + 5! = 1 + 24 + 120 = 145 
which is equal to 145.Thus, answer is 1.

Your Task:
You don't need to read input or print anything.Your task is to complete the function isPerfect() which takes a number N as input parameter and returns 1 if N is perfect.Otherwise, it returns 0.


Expected Time Complexity: O(Log10N)
Expected Auxillary Space: O(constant)


Constraints:
1<=N<=109
*/


class Solution {
  public:
    int isPerfect(int N) {
        int fact[10] = {1,1,2,6,24,120,720,5040,40320,362880};

            int original = N;
            int sum = 0;

            while(N > 0){
                int d = N % 10;
                sum += fact[d];
                N /= 10;
            }
            return (sum == original) ? 1 : 0;
    }
};
