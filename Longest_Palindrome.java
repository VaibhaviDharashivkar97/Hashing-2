class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        boolean single = false;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(map);
        for(char c: map.keySet()){
            int val = map.get(c);
            if( val%2 == 1){
                if(val == 1  && single == false){
                    single = true;
                    count += val;
                }
                else if(val > 1  && single == false){
                    single = true;
                    count += val;
                }
                else if(val > 1  && single == true)
                    count += (val - 1);
            }
            if(val%2==0){
                count += val;
            }
        }
        return count;
    }
}
