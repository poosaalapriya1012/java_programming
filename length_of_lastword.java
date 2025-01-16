public class length_of_lastword {
 
    public static void main(String[] args) {
        String s="hello world java            ";
       ;
        String res="";
        s=s.trim();
        int l=s.length();
     
        for(int i=l-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                 res=s.charAt(i)+res;
            }
            else{
                break;
            }
            
        }
        System.out.println(res.length());
    }
}

