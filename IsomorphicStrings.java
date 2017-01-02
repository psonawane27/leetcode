import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> m = new HashMap<Character, Character>();
        char sChar, tChar;
        for(int i=0; i<s.length();i++){
            sChar = s.charAt(i);
            tChar = t.charAt(i);
            if(!m.containsKey(sChar)){
                if(m.containsValue(tChar))
                    return false;
                m.put(sChar, tChar);
            }
            else{
                if(m.get(sChar) != tChar)
                    return false;
            }
        }
        return true;
    }
}