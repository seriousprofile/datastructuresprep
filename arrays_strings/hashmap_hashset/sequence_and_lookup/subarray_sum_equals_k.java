class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); //this is because sum = 0 occurs ONCE.

        int sum = 0;
        int count = 0; // count = 1 + 1 = 2

        for(int num : nums){
            sum += num; // sum = 3

            if(map.containsKey(sum - k)){ // 3 - 2 = 1
                count += map.get(sum - k); 
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1); // hashmap: {(0 : 1), (1, 1)}
        }

        return count;
    }
}
