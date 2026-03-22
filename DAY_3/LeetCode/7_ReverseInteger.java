class Solution {
    public int reverse(int x) {
        int neg=1;
        long numx=x;
        if(x<0){
             neg=-1;
        }  
        numx=Math.abs(numx);
        String s=""+numx;
        System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        long num=Long.parseLong(sb.toString());
        num=neg*num;
        if(num<Integer.MIN_VALUE||num>Integer.MAX_VALUE)  return 0;
        return (int)num;
    }
}


// class Solution {
//     public int reverse(int x) {
//         long rev_num=0;
//         while(x!=0){
//             int digit=x%10;
//             rev_num=rev_num*10+digit;
//             x/=10;
//         }
//         if(rev_num>Integer.MAX_VALUE||rev_num<Integer.MIN_VALUE) return 0;
//         return (int)rev_num;
//     }
// }