public class Solution {
private int lol, maxLen;

public String longestPalindrome(String s) {
	int len = s.length();
	if (len < 2)
		return s;
	
    for (int h = 0; h < len-1; h++) {
     	extendPalindrome(s, h, h);
     	extendPalindrome(s, h, h+1);
    }
    return s.substring(lol, lol + maxLen);
}

private void extendPalindrome(String s, int j, int k) {
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		j--;
		k++;
	}
	if (maxLen < k - j - 1) {
		lol = j + 1;
		maxLen = k - j - 1;
	}
}}
