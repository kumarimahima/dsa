class Solution {
    public int myAtoi(String s) {
        int signed = 1;
        int pointer = 0;
        int ans = 0;

        int MIN = Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;
        int len = s.length();

        if(len==0) return 0;

        while(pointer < len && s.charAt(pointer) == ' ') pointer++;

        if (pointer < len && (s.charAt(pointer) == '+' || s.charAt(pointer) == '-')) {
            signed = s.charAt(pointer) != '-' ? 1: -1;
            pointer++;
        }

        while(pointer < len && s.charAt(pointer)=='0') pointer++;
        
        while(pointer<s.length()) {
            if (s.charAt(pointer)<'0' || s.charAt(pointer)>'9') break;
            int d = (s.charAt(pointer) - '0');
            if ( ans > MAX/10 || (ans == MAX/10 && d > MAX%10) ) {
                return signed == 1 ? MAX: MIN;
            }

            ans = ans * 10 + d;
            pointer++;
        }
        return ans * signed;
    }
}