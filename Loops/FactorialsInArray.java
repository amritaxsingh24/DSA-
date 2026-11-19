/*
Given an array arr[] containing n integers, return a list containing all elements from the array that are factorial numbers of some positive integer.

If a factorial appears multiple times, include all occurrences in the output.
Preserve the original order.
Examples :

Input: arr[] = [2, 1, 5, 9]
Output: [2, 1]
Explanation: 
2 is the factorial of 2, i.e. 2! = 1 * 2 = 2
1 is the factorial of 1, i.e. 1! = 1
Input: arr[] = [2, 5, 3, 6, 9, 12, 24]
Output: [2, 6, 24] 
Explanation:
2 is the factorial of 2, i.e. 2! = 1 x 2 = 2 
6 is the factorial of 3, i.e. 3! = 1 × 2 × 3 = 6
24 is the factorial of 4, i.e. 4! = 1 × 2 × 3 × 4 = 24
Constraints:

1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 109
*/


class Solution {
    public List<Integer> factorialNumbers(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            int num = arr.get(i);
            long fact = 1;
            int j = 1;
            
            while(fact < num){
                fact *= j;
                j++;
            }
        
            if(fact == num){
                ans.add(num);
            }
        }
        return ans;
    }
}
