/*
Space complexity: O(1)
Time Complexity: O(N)
*/
import java.util.*;

public class IsomorphicStrings {
    /*
	Space complexity: O(N)
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
    }*/
	public boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
    }
}