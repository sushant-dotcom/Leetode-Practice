import java.util.ArrayList;
import java.util.List;

public class pasccles {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        ans.add(a);
        List<Integer> b=new ArrayList<>();
        b.add(1);
        b.add(1);
        ans.add(b);
        for(int i=2;i<numRows;i++){
            List<Integer> aa=ans.get(i-1);
            List<Integer> ab=new ArrayList<>();
            ab.add(1);
            for(int j=0;j<aa.size()-1;j++){
                ab.add(aa.get(j)+aa.get(j+1));
            }
            ab.add(1);
          //  aa.clear();
            ans.add(ab);
           // ab.clear();
        }
        return ans;
    }
}
