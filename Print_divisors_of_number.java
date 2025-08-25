public class Print_divisors_of_number
{
    public static void main(String ss[])
	{
		
		// 1 . Brute force approach
		/*
	    int no = 12;
		
		for(int i=1;i<=no;i++)
		{
		    if(no % i == 0)
			{
			    System.out.print(i+" ");
			}
		}
		*/
		
		
		// 2 . optimal
		
		int no = 12;
		
		
		// store the divisors in this array
		int arr[] = new int[6];
		int j = 0;
		
		
	    // check only upto sqrt of no
		for(int i=1;i<Math.sqrt(no);i++)
		{
			//by , property of non-negative integer 
			if(no % i == 0)
			{
				arr[j] = i;
				j++;
				
				
				// if i is divisor of n then n/i is also a divisor of n.
				// for when i becomes equal to sqrt then dont push again.
				if(i != no / i)
				{
					arr[j] = no/i;
					j++;
				}
			}
		}
		
		
		
		// covert array values in ascending order
		for(int i=0;i<arr.length-1;i++)
		{
			for(int k=(i+1);k<arr.length;k++)
		  {
			if(arr[i]>arr[k])
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		  } 
		}
		
		// now , print the array..
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
	}
}