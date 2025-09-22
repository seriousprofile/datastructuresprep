class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs); // 1 1 2 3 4 
        int money = 0; 
        int bars = 0; 

        for(int i = 0; i < costs.length; i++){
            money += costs[i]; 
            if(money <= coins){
                bars++;
            } else {
                break;
            }
        }

        return bars;
    }
}
