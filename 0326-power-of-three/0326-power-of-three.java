class Solution {
    public boolean isPowerOfThree(int n) {
        return root(n);
    }

    boolean root(int n){
        if(n==1) return true;
        if(n<=0 || n%3!=0) return false;
        return root(n/3);
    }
}