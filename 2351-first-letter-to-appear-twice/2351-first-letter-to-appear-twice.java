class Solution {
    public char repeatedCharacter(String s) {
    
        Set<Character> set = new HashSet<>();
     
     Character c = null;
        for (char e : s.toCharArray()){
            if (!set.add(e)){
                c =e;
                break;
            }
           
        }return c;
    }
}