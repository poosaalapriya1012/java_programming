import java.util.*;
class find_all_anagrams_in_a_string{
    public static boolean isAnagram(HashMap<Character,Integer>mp1,HashMap<Character,Integer>mp2){
        if(mp1.size()!=mp2.size()){
            return false;
        }
        for(char key:mp1.keySet()){
            if(!mp2.containsKey(key)){
                return false;
            }
            int  a=mp1.get(key);
            int b=mp2.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
   }
    
    public static void main(String[] args) {
        String s="cbabc";
        String p="abc";
        int k=p.length();
        HashMap<Character,Integer>mp1=new HashMap<>();
        HashMap<Character,Integer>mp2=new HashMap<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            mp2.put(p.charAt(i),mp2.getOrDefault(p.charAt(i),0)+1);
            
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            mp1.put(s.charAt(r),mp1.getOrDefault(s.charAt(r),0)+1);
            
            if(r-l+1>k){
                mp1.put(s.charAt(l),mp1.get(s.charAt(l))-1);
                if(mp1.get(s.charAt(l))==0){
                    mp1.remove(s.charAt(l));
                }
                l++;
            }
            if(r-l+1==k && isAnagram(mp1,mp2)){
                arr.add(l);
                
            }
            
        }
        System.out.println(arr);
    
}
}