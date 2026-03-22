class Solution {
    public int minCostToMoveChips(int[] positions) {
        int even=0;
        int odd=0;
        for(int i=0;i<positions.length;i++){
            if(positions[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return (even<odd)?even:odd;
    }
}