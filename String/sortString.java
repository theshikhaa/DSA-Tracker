import java.util.Scanner;
class sortString {
    public String sortStringf(String s) {
        // code here
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        
        for(int i = 0; i<arr.length; i++){
            
            while(arr[i] > 0){
                
                sb.append((char)(i + 'a'));
                
                arr[i]--;
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sortString obj = new sortString();
        System.out.println(obj.sortStringf(s));
    }
}