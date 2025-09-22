class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0, matches = 0;

        while(i < players.length && j < trainers.length){
            if(players[i] > trainers[j]){
                j++;
            } else {
                matches++;
                i++;
                j++;
            }
        }

        return matches;
    }
}
