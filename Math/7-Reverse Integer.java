class Solution {
    public int reverse(int x) {
        int rev=0;
        int rem;
        if (x == Integer.MIN_VALUE){
            return 0;
        }
        int numberToReverse = Math.abs(x);
        while (numberToReverse>0){
            rem=numberToReverse%10;
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            rev=(rev*10)+rem;
            numberToReverse=numberToReverse/10;
        }
        return x < 0 ? -rev : rev;  
    }
}