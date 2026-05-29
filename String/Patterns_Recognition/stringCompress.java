package Patterns_Recognition;

public class stringCompress {
    public int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        // HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < chars.length){
            char curr = chars[i];
            int count = 0;

            while(i < chars.length && chars[i]== curr){
                count++;
                i++;
            }

            sb.append(curr);

            if(count > 1){
                sb.append(count);
            }
        }


        for(int j = 0; j<sb.length(); j++){
            chars[j] = sb.charAt(j);
        }


        return sb.length();

    }

    public static void main(String[] args) {
        stringCompress obj = new stringCompress();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(obj.compress(chars));
    }
}
