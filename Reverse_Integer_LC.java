class Reverse_Integer_LC {
    public int reverse(int x) {

    

        int cpx = x;
        int rev = 0;


        
        while(cpx != 0)
        {
            int ld = cpx % 10;


            //avoids goigd to overflow the rev value
            // here , we check before multiply the rev by 10 and add ld in rev. 
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && ld < -8))
            {
                return 0;
            }


            //avoids goigd to overflow the rev value
            // here , we check before multiply the rev by 10 and add ld in rev. 
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && ld > 7))
            {
                return 0;
            }


            rev= rev * 10 + ld;
            cpx = cpx / 10;
        }

        return rev;
        
    }
}