class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap< Character , Integer > freq = new HashMap<>();
       for(int i = 0; i< s.length();i++){
        char x = s.charAt(i);
        char y = t.charAt(i);
        freq.put(x, freq.getOrDefault(x,0) + 1);
        freq.put(y, freq.getOrDefault(y,0) - 1);
       }
       for(int count: freq.values()){
        if(count !=0){
            return false;
        }
       }
       return true;

    }
}
