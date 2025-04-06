
import java.awt.image.RescaleOp;

public class Occu {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String res = occu(str);
        System.out.println(res);
    }

    static String occu(String str){
        char[] charArr = str.toCharArray();
        StringBuilder res = new StringBuilder();
        boolean[] visited = new boolean[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            if(visited[i]) continue;
            int cnt =1;

            for (int j = i+1; j < charArr.length; j++) {
                if(str.charAt(j) == str.charAt(i)){
                    cnt++;
                    visited[j] = true;
                }
            }
            res.append(str.charAt(i)).append(cnt);
        }
        return res.toString();
    }
}
