import java.util.HashMap;
class Solution{
    public boolean isAnagram(String s,String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!hm.containsKey(ch))
                return false;
            hm.put(ch,hm.get(ch)-1);
            if(hm.get(ch)==0)
                hm.remove(ch);
        }
        return hm.isEmpty();
    }
}