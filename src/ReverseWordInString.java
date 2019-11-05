import java.util.Arrays;
import java.util.Collections;

public class ReverseWordInString {

    public static void main(String[] args) {
        String s =" Hello how are you?";
        String[] words =s.trim().split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        /*Collections.reverse(Arrays.asList(words));

        for(String ss :words){
            sb.append(ss+" ");
        }*/
        System.out.println(sb.toString());
    }
}
