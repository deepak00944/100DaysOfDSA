// Write a program to count the occurrences of each character in a given string while maintaining the order of their first appearance. The output should be a string where each character is followed by its frequency.
class Occurrence{
    public static void main(String[] args) {
        String str ="occurrence";
        String res = occurrence(str);
        
        System.out.println(res);
    }

    static String occurrence(String str){
        StringBuilder res = new StringBuilder();
        int n = str.length();
        boolean [] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(visited[i]) continue;
            int count= 1;
            char currChar = str.charAt(i);
            for (int j = i+1; j < n; j++) {
                if(str.charAt(j) == currChar){
                    count++;
                    visited[j] = true;
                }
            }
            res.append(currChar).append(count);
        }
        

        return res.toString();
    }
}