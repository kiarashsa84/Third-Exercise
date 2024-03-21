import java.util.regex.Pattern;
import java.util.regex.Matcher; 
import java.util.Scanner; 

public class HesabKetab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first_num = 0; 
        int seccond_num = 0; 
        int result = 0; 
        int baghi =0 ; 
        int length = 0; 

        Pattern pt = Pattern.compile("^(.+)(=)(\\s*)(.+)(\\s*)$");
        Pattern pt2 = Pattern.compile("^(.+?)(\\s*)(\\+)(\\s*)(.+?)(\\s*)$"); 
        Pattern pt5 = Pattern.compile("^(\\s*)(#)(\\d*)$"); 

        Pattern pt3 = Pattern.compile("#"); 

        String line = input.nextLine(); 
        Matcher mt = pt.matcher(line); 
        
        if(mt.matches()){
            // first_num = Integer.parseInt(mt.group(1));
            // seccond_num = Integer.parseInt(mt.group(5));
            // result = first_num + seccond_num;
            String part1 = mt.group(1) ; 


            String part2 = mt.group(4);
            // System.out.println(part2);

            Matcher mt_right = pt5.matcher(part2);

            if(mt_right.matches()){
                // System.out.println(mt_right.group(3));
                length = mt_right.group(3).length();
                // baghi = Integer.parseInt(mt_right.group(3)); 
            }
            

            Matcher mt2 = pt2.matcher(part1);
            
            
            if(mt2.matches()){
                
                String part1_1 = mt2.group(1);
                String part1_2 = mt2.group(5);
                
                
                Matcher v1 = pt3.matcher(part1_1);
                Matcher v2 = pt3.matcher(part1_2);
                Matcher v3 = pt3.matcher(part2); 

                
                if (v1.find()){
                    
                    boolean fright = false; 
                    boolean fleft = false; 

                    Pattern v1p = Pattern.compile("^(\\d)(#)(.*)"); 
                    Pattern v1p2 = Pattern.compile("^(.*)(#)(\\d)");
                    Matcher v1m1 = v1p.matcher(part1_1);
                    Matcher v1m2 = v1p2.matcher(part1_1);
                    
                    
                    first_num = Integer.parseInt(part1_2);
                    seccond_num = Integer.parseInt(part2);
                    result = seccond_num  - first_num; 
                    // System.out.println(result);



                    if (v1m1.matches()){
                        // System.out.println(v1m1.group(1));

                        String result_str = String.valueOf(result);
                        int size_in_un = v1m1.group(1).length(); 
                        if(v1m1.group(1).equals(result_str.substring(0,size_in_un))){
                            fleft = true;
                        }
                    }
                    else{
                        fleft = true;
                    }

                    if(v1m2.matches()){
                        // System.out.println(v1m2.group(3));
                        String result_str = String.valueOf(result);
                        int size_in_un = v1m2.group(3).length(); 
                        if(v1m2.group(3).equals(result_str.substring(result_str.length()-size_in_un))){
                            fright = true;
                        }
                    }
                    else{
                        fright = true;
                    }


                    if (fright & fleft){
                        System.out.println(result+" + " + part1_2 +" = "+ part2);
                    }
                    else{
                        System.out.println(-1);
                    }
                   
                    // System.out.println(first_num + " " + seccond_num);
                    
                    // System.out.println(1);

                }else if(v2.find()){

                    first_num = Integer.parseInt(part1_1);
                    seccond_num = Integer.parseInt(part2);
                    // System.out.println(first_num + " " + seccond_num);
                    result = seccond_num - first_num;
                    // System.out.println(result); 



                    boolean fright = false; 
                    boolean fleft = false; 

                    Pattern v1p  = Pattern.compile("^(\\d)(#)(.*)"); 
                    Pattern v1p2 = Pattern.compile("^(.*)(#)(\\d)");
                    Matcher v1m1 = v1p.matcher(part1_2);
                    Matcher v1m2 = v1p2.matcher(part1_2);


                    if (v1m1.matches()){
                        // System.out.println(v1m1.group(1));

                        String result_str = String.valueOf(result);
                        int size_in_un = v1m1.group(1).length(); 
                        if(v1m1.group(1).equals(result_str.substring(0,size_in_un))){
                            fleft = true;
                        }
                    }
                    else{
                        fleft = true;
                    }

                    if(v1m2.matches()){

                        // System.out.println(v1m2.group(3));
                        String result_str = String.valueOf(result);
                        int size_in_un = v1m2.group(3).length(); 
                        if(v1m2.group(3).equals(result_str.substring(result_str.length()-size_in_un))){
                            fright = true;
                        }
                    }
                    else{
                        fright = true;
                    }


                    if (fright & fleft){
                        System.out.println(part1_1+" + " + result +" = "+ part2);
                    }
                    else{
                        System.out.println(-1);
                    }

                }
                
                else if(v3.find()){


                    
                    // first_num = Integer.parseInt(part1_1);
                    // seccond_num = Integer.parseInt(part1_2);
                    // result = seccond_num + first_num; 
                    

                    // System.out.println(mt.group(1)+  mt.group(2) +" "+ result);


                    boolean fright = false; 
                    boolean fleft = false; 

                    Pattern v1p = Pattern.compile("^(\\d)(#)(.*)"); 
                    Pattern v1p2 = Pattern.compile("^(.*)(#)(\\d)");
                    Matcher v1m1 = v1p.matcher(part2);
                    Matcher v1m2 = v1p2.matcher(part2);
                    
                    
                    first_num = Integer.parseInt(part1_1);
                    seccond_num = Integer.parseInt(part1_2);
                    result = seccond_num  + first_num; 
                    // System.out.println(result);



                    if (v1m1.matches()){
                        // System.out.println(v1m1.group(1));

                        String result_str = String.valueOf(result);
                        int size_in_un = v1m1.group(1).length(); 
                        if(v1m1.group(1).equals(result_str.substring(0,size_in_un))){
                            fleft = true;
                        }
                    }
                    else{
                        fleft = true;
                    }

                    if(v1m2.matches()){
                        // System.out.println(v1m2.group(3));
                        String result_str = String.valueOf(result);
                        int size_in_un = v1m2.group(3).length(); 
                        if(v1m2.group(3).equals(result_str.substring(result_str.length()-size_in_un))){
                            fright = true;
                        }
                    }
                    else{
                        fright = true;
                    }


                    if (fright & fleft){
                        System.out.println(part1_1+" + " + part1_2 +" = "+ result);
                    }
                    else{
                        System.out.println(-1);
                    }
                }
                

                
            }

        }

    }
}
