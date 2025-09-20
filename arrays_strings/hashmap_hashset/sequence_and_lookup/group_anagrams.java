class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){ //traverse through array
            char[] ch = s.toCharArray(); //break each word in the array
            Arrays.sort(ch); //sort each word
            String chh = new String(ch); // convert it back to string
        

        if(!map.containsKey(chh)){ //if the map doesn't have this sorted word,
            map.put(chh, new ArrayList<>()); //add the sorted word and create arraylist.
        }

        map.get(chh).add(ch); //else/then, add the corresponding word from the actual array.
        }

        return new ArrayList<>(map.values()); //return a new arraylist that displays only the values.
    }
}
