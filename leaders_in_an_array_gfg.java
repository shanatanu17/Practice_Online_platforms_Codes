class Solution {
    static ArrayList<Integer> leaders_in_an_array_gfg(int arr[]) {
        
        int n = arr.length;
        
        
      // use this var for store the maximum value we have from last index to current index...
       int maxele = arr[n-1];
       
       
       ArrayList<Integer> list = new ArrayList<>();
       
       
       // last element of the array is always a leader in array...... so , add it first
       list.add(arr[n-1]);
       
       
       for(int i= n-2;i>=0;i--)
       {s
           if(arr[i] >= maxele)
           {
               list.add(arr[i]);
               maxele = arr[i];
           }
       }
       
       
       
       // reverse here beacause , we traverse and store the elements from last of array.
       // so , our answer also comes in reverse order
       //so, we need to came it with normal order...
       Collections.reverse(list);
       
       return list;
        
    }
}
