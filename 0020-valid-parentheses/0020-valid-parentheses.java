class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        // if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}') return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(st.isEmpty()) return false;
                char tos=st.peek();
                System.out.println("");
                if(tos=='(' && s.charAt(i)==')' || tos=='[' && s.charAt(i)==']' || tos=='{' && s.charAt(i)=='}'){
                    st.pop();
                }
                else{
                    return false;
                }

                
            }
        }

        if(st.isEmpty()) return true;

        return false;
    }
}
