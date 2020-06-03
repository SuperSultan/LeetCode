class Solution {
    
    public boolean hasAllCodes(String s, int k) {
        
        if ( s.length() < k )
            return false;
        Set<String> set = new HashSet<>();
        for(int i=0; i<=s.length()-k; i++) {
            //System.out.println("i = " + i + " value: " + s.substring(i, i+k));
            set.add(s.substring(i, i+k));
        }
        
        return set.size() == Math.pow(2, k);
    }
}
