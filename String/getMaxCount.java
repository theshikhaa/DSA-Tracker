import java.util.HashMap;
import java.util.Scanner;

public class getMaxCount {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
        }
        
        char ans = 'z';
        
        
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(max < freq){
                max = freq;
                ans = ch;
            } 
            
            else if(max == freq && ch < ans){
                
                ans = ch;
                
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getMaxCount obj = new getMaxCount();
        System.out.println(obj.getMaxOccuringChar(s));
    }

}
