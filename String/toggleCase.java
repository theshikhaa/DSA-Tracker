import java.util.Scanner;

public class toggleCase {
    public static String toggleCasef(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
            
            sb.append(ch);
           
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   

        System.out.println(toggleCasef(s));
    }
}
