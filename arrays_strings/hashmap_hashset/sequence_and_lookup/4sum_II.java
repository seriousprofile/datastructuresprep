class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        //step 1: find the frequencies
        for(int num1 : nums1){
            for(int num2 : nums2){
                int sum1 = num1 + num2;
                map.put(sum1, map.getOrDefault(sum1, 0)+ 1);
            }
        }

        //step 2: declare a count variable 
        int count = 0; 

        //step 3: traverse through nums3 and nums4 the same way
        for(int num3 : nums3){
            for(int num4 : nums4){
                int sum2 = num3 + num4;
                int target = -sum2;

                if(map.containsKey(target)){
                    count += map.get(target);
                }
            }
        }

        return count;
    }
}
