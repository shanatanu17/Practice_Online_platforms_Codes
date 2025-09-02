class Solution {
    public int maxSubArray_kadanes_algorithm(int[] nums) {


// 1. USing 3 loops.......................  ---------------------O(n^3)

        // int n = nums.length;
        // int maxsum = Integer.MIN_VALUE;

        // for(int i=0;i<n;i++)
        // {
        //     for(int j= i;j<n;j++)
        //     {
        //         int sum = 0;
                
        //         for(int k=i;k<=j;k++)
        //         {
        //             sum = sum + nums[k];
        //         }

        //         maxsum = Math.max(sum , maxsum);
        //     }
        // }

        // return maxsum;



    //2. Using 2 loops ---------------------O(n^2)

    // int n = nums.length;
    // int maxsum = Integer.MIN_VALUE;

    // for(int i=0;i<n;i++)
    // {
    //     int sum = 0;
    //     for(int j=i;j<n;j++)
    //     {
    //        sum = sum + nums[j];

    //        maxsum = Math.max(sum  , maxsum);
    //     }

        
    // }

    // return maxsum;


    // 3 . Using kadanes algorithm-------------   T.C ===>  O(n)


    int maxsum = Integer.MIN_VALUE;
    int sum = 0;


    for(int i=0;i<nums.length;i++)
    {
        sum = sum + nums[i];

        if(sum > maxsum)
        {
            maxsum  = sum;
        }

        if(sum < 0)
        {
            sum = 0;
        }
    }

    return maxsum;

        
        
    }
}