class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int totalSum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        sum=totalSum-sum;
        return sum;
    }
}

/*
int xor=0;
int i=0;
for(i=0;i<nums.length;i++){
    xor=xor^i^nums[i];
}
 return xor^i;
*/