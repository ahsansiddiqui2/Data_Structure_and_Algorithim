
import java.util.Arrays;
/**
 * two
 */
public class two {

    public static void main(String[] args) {
        reverse(args);

    }
    public static void reverse(String[] a){
        char[] c = a[0].toCharArray();
        for(int i=0,j=c.length-1;i<j;i++,--j){
            
            if(c[i]=='0'){
                continue;
                
            }
            else{
                char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            }
        }
        StringBuffer w = new StringBuffer();
        for(int i=0;i<c.length-1;i++){
            if(c[i+1]==)
            w.append(q);
        }
        System.out.println(w);
    }
}