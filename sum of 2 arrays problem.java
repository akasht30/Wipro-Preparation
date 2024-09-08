

Let us suppose that a person is given two numbers ‘A’ and ‘B’ as two arrays of ‘N’ and ‘M’ length respectively. All the array elements individually represent a digit. How will the person find the sum of the two numbers and how can the sum be returned in the form of an array?
Additional Notes, Input Formats, and Samples: Sum of Two Arrays Problem






/*

        Time Complexity: O(max(N, M))

        Space Complexity: O(1)

        Where N is the size of the first array and M is the size of the second array.

 */
public class Solution {
public static int[] findArraySum(int[] a, int n, int[] b, int m) {
int ans[] = new int[Math.max(n, m)];
int carry = 0;
int sum = 0;
int k = ans.length – 1;
int i = n – 1;
        int j = m – 1;
while (i >= 0 || j >= 0) {
sum = 0;
            // If we have some elements left in the first array, then add it to the sum.
if (i >= 0) {
sum += a[i];
i–;
}
            // If we have some elements left in the second array, then add it to the sum.
if (j >= 0) {
sum += b[j];
j–;
}
sum += carry;
int lastDigit = sum % 10;
carry = sum / 10;
ans[k–] = lastDigit;
}
        // If still some carry is left, then push it to the answer.
if (carry != 0) {
int[] newAns = new int[ans.length + 1];
newAns[0] = carry;
for (int p = 1; p < newAns.length; p++) {
newAns[p] = ans[p – 1];
}
return newAns;
}
return ans;
}
}
