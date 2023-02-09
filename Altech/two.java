public class two {
    public static void main(String[] args) {
        reverse(args[0]);
    }
       public static void reverse(String a){
        char[] c = a.toCharArray();
        for(int i=0,j=c.length-1;i<j;i++,--j){
                char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            }
        String w ="";
        for(int i=0;i<c.length;i++){
            w+=c[i];
        }
        int o = Integer.parseInt(w);
        System.out.println(o);
    }
}
