class Solution {
    public String frequencySort(String s) {
        //step 1: count the frequencies: 
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        //step 2: sort chars by their frequency.
        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> map.get(b) - map.get(a));

        //step 3: build your string again.
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            int freq = map.get(c);
            while(freq-- > 0){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
