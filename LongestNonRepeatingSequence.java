public class LongestNonRepeatingSequence {

    public static int longestNonRepeating(String str){
        String new_str = "";
        
        int max_length = -1;

        if(str.isEmpty()){
            return 0;
        }
        else if(str.length() == 1){
            return 1;
        }

        for(char c : str.toCharArray()){
            String current = String.valueOf(c); //string valueOf() method converts different types of values into string. 
            if(new_str.contains(current)){
                new_str = new_str.substring(new_str.indexOf(current)+1);
            }
            new_str = new_str + String.valueOf(c);
            max_length = Math.max(new_str.length(),max_length );

        }
        return max_length;
    }
    
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(str);

        int len = longestNonRepeating(str);
        System.out.println(len);
    }
}
