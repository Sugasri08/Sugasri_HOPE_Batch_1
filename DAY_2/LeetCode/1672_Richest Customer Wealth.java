class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        int max=-1;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;
        
    }
}


/* 
int max=Integer.MIN_VALUE:
for(int [] account:acounts){
    int amount=0;
    for(int value:account){
        amount+=value;
    }
    if(amount>max){
        max=amount;
    } 
    
}
*/