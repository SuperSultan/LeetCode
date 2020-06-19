class Solution {
    public boolean isUgly(int num) {
        
        while ( num != 0 && ( num % 2 == 0 || num % 3 == 0 || num % 5 == 0) ) {
            if ( num % 2 == 0 )
                num /= 2;
            else 
                num = (num % 3 == 0) ? num / 3 : num / 5;
        }
        return num == 1;
    }
}
