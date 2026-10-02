import java.util.*;
class Solution{
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int m = num.length - 1;
        int carry = 0;

        while (m >= 0 || k > 0 || carry > 0) {
            int numval = 0;

            if (m >= 0) {
                numval = num[m];
            }

            int d = k % 10;
            int sum = numval + d + carry;

            int digit = sum % 10;
            carry = sum / 10;

            ans.add(digit);

            k = k / 10;
            m--;
        }

        Collections.reverse(ans);

        return ans;
    }
}