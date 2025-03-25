class Union {
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {1,2,3,4,5};
        int res = findUnion(a, b);
        System.out.println(res);
    }
    public static int findUnion(int a[], int b[]) {
        int[] cnt = new int[(int)(1e5+5)];
        int res=0;
        for(int i: a) cnt[i]++; // cnt[1] = 1, cnt[2] = 1,....
        for(int i: b) cnt[i]++; // cnt[1] =2, cnt[2] = 2, .... cnt[5] =1;
        for(int i: cnt) if(i>0)res++; 
        return res;
        
    }
}