import java.util.*;

public class CountDistinctElement {

    public static void distinct(int matrix[][],int n){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i < n; i++){
            map.put(matrix[0][i],1);
        }

        for(int i=1; i < n; i++){
            for(int j=0; j < n; j++){
                 if(map.containsKey(matrix[i][j]) && map.get(matrix[i][j] == i)){
                     map.put(matrix[i][j],i+1);
                 }
            }
        }


    }

    public static void main(String[] args) {
        
            int matrix[][] = { { 2, 1, 4, 3 },
                              { 1, 2, 3, 2 },
                              { 3, 6, 2, 3 },
                              { 5, 2, 5, 3 } };
            int n = 4;
            distinct(matrix, n);
          
    }
}