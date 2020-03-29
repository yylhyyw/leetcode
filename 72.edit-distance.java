/*
 * @lc app=leetcode id=72 lang=java
 *
 * [72] Edit Distance
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        // BF method
        int rep = 0, del = 0, insert = 0;
        if(word1.length() == 0) {
            return word2.length();
        }
        if(word2.length() == 0) {
            return word1.length();
        }
        if(word1.charAt(word1.length()-1) == word2.charAt((word2.length()-1))) {
            return minDistance(word1.substring(0, word1.length()-1), word2.substring(0, word2.length()-1));
        }else {
            rep = minDistance(
                word1.substring(0, word1.length()-1),word2.substring(0, word2.length()-1) // doing replace
            );
            insert = minDistance(
                word1.substring(0, word1.length()),word2.substring(0, word2.length()-1) // doing insert
            );
            del = minDistance(
                word1.substring(0, word1.length()-1),word2.substring(0, word2.length()) // doing insert
            );
            int tmp = (rep < insert ? rep : insert);
            return 1 + (tmp < del ? tmp : del);
        }
        // TODO: DP Method??
    }
}
// @lc code=end

