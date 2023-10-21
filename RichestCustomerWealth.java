/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i customer has in the jth bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {3,2,1}
        };
        int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int row=0; row<accounts.length; row++){
            int max2=0;
            for(int col=0; col<accounts[row].length; col++){


                max2=max2+accounts[row][col];
                if (max2>max){
                    max=max2;
                }
            }
        }
        return max;
    }
}
