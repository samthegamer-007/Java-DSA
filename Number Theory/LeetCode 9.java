//chechk palindrome
class Solution {
    public boolean isPalindrome(int x) {
        int y=0, d=0;
        int tmp= x;
        while(x>0)
        {
            d=x%10;
            y=(y*10)+d;
            x/=10;
        }
        return tmp == y;
    }
    
}
                 
