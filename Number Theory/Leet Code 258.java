//add digits till no. of digits is 1
class Solution 
{
    public int addDigits(int num) 
    {
        int d=0;
        int c=0;
        int res=0;
        while(num>0)
        {
        d=num%10;
        res+=d;
        num/=10;
        c++;

        }
        if(c>1)
        return addDigits(res);
        else 
        return res;       
    }
    
}
