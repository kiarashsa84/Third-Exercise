import java.util.regex.Pattern;
import java.util.regex.Matcher; 

public class HesabKetab {
    public static void main(String[] args) {
        
        int first_num = 0; 
        int seccond_num = 0; 
        int result = 0; 

        Pattern pt = Pattern.compile("^(\\d+)(\\s*)(.)(\\s*)(\\d+)(\\s*)(=)(\\s*)(#)$");
        Matcher mt = pt.matcher("32333 +23= #"); 
        
        if(mt.matches()){
            first_num = Integer.parseInt(mt.group(1));
            seccond_num = Integer.parseInt(mt.group(5));
            result = first_num + seccond_num; 
            System.out.println(result);

            
        }

    }
}
