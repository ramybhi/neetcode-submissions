class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(m1.containsKey(s.charAt(i))){
                m1.put(s.charAt(i), m1.get(s.charAt(i)) + 1);
            } else{
            m1.put(s.charAt(i), 1);
            }
        }
        for(int j=0; j<t.length();j++){
            if(m2.containsKey(t.charAt(j))){
                m2.put(t.charAt(j), m2.get(t.charAt(j))+1);
            } else{
            m2.put(t.charAt(j), 1);
            }
        }
        return m1.equals(m2);
    }
}
