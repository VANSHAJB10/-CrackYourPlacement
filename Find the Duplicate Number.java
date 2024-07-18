class Solution {
     public int findDuplicate(int[] arr)
    {
        int[] hashMap=new int[arr.length];
        for(int nums : arr)
        {
            hashMap[nums]++;
            if(hashMap[nums]>1)
            {
                return nums;
            }
        }
        return 0;
    }
}
