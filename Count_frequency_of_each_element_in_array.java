import java.util.*;
class Count_frequency_of_each_element_in_array{
    public static void main(String[] args) {
       HashMap<Integer,Integer>h=new HashMap<>();
       int arr[]={10,5,10,15,10,5};
       for (int i=0;i<arr.length;i++){
           if(h.containsKey(arr[i])){
               h.put(arr[i],h.get(arr[i])+1);
           }
           else{
               h.put(arr[i],1);
           }
       }
     
       for(Map.Entry<Integer,Integer> e : h.entrySet()){
       System.out.println(e.getKey() + " "+ e.getValue());
    }
    }
}