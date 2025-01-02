import java.util.*;
class PascalsTriangle_leetcode118{
    public static void main(String[] args) {
        int rows=5;
        List<List<Integer>> ans =generatePascalsTriangle(rows);
        System.out.println(ans);
    }
    public static List<List<Integer>> generatePascalsTriangle(int numRows) {
        List<List<Integer>> ans =new ArrayList <>();
        if (numRows <= 0) {
            return ans;
        }
        List<Integer>firstrow=new ArrayList <>();
        firstrow.add(1);
        ans.add(firstrow);
        for ( int i=1;i<numRows;i++){
            List<Integer>temprow=new ArrayList <>();
            temprow.add(1);
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                temprow.add(val);
            }
            
            
             temprow.add(1);
            ans.add(temprow);
        }
       return ans;
    }
}