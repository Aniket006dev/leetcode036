class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        boolean flag=false;
        String rev="";
        int rnum=0;
        String str=""+num;;
        String str2="";
        if(x<=0){
            num=0-num;
            flag=true;
        }
        while(num>0){
            int rem=num%10;
            rnum=(rnum*10)+rem;
            rev=rev+rem;
            num=num/10;
        }
        if(flag==true){
            str2=(x==0)?"0":""+rev+"-";

        }
        if(rev.equals(str) || str2.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}