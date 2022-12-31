public class Anagram {

    static void sort(char arr[]){
           int i = 0;
           while(i < arr.length){
               int j = i+1;
               while(j < arr.length){
                   if(arr[j] < arr[i]){
                       char temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                   }
                   j++;
               }
               i++;
           }
    }
    
    public static boolean isAnagram(char ch1[] , char ch2[]){

          if(ch1.length != ch2.length){
              return false;
          }else{
              for(int i = 0; i < ch1.length ; i++){
                  if(ch1[i] != ch2[i]){
                      return false;
                  }
              }
          }
          return true;
    }

    public static void main(String[] args) {
       // String str1 = "listen";
       String str1 = "triangle";
        String str2 = "integral";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        sort(ch1);
        sort(ch2);

        if(isAnagram(ch1, ch2)){
            System.out.println("It is an Anagram");
        }else{
            System.out.println("Not an Anagram");
        }


    }
}
