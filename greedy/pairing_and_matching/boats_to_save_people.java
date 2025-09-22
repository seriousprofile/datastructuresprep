class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); // 1 2 2 3 

        int boats = 0; 
        int i = 0, j = people.length - 1; 

        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
            boats++;
        }

        return boats; 
    }
}

/*
1 2 2 3
i = 1, j = 3, sum = 4 > 3 -> boats = 1, j = 2
i = 1, j = 2, sum = 3 <= 3 -> i = 2, j = 2, boats = 2
i = 2, j = 2, sum = 4 > 3 -> boats = 3, j = 1 (loop breaks!!)
*/
