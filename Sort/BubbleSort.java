package Sort;

/*
    In Bubble Sort we check Right and Left  element of two numbers

    // If sorting want in ascending order
    If left is greater than right then it will exchnnge each others position

    // If sorting want in descending order
    If left is smaller than right then it will exchnnge each others position

    It takes (n-1) or less passes
*/    

class BubbleSort {
    public static void main(String[] args) {
        
       int a[] = {33,69,23,45,87,98,66};
//          int a[] = {20,30,40,50,60,70};
        int n = a.length;

        for(int i = 0; i < n-1 ; i++) {

            boolean Sort = true;

            for(int j = 0; j < n-1-i ; j++) {

                if(a[j+1] < a[j]) {

                    int temporary = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temporary;

                    Sort = false;
                }
            }   

            // Sort is just using for Opltimization of Bubble Sort
            // It will not go again in loop if already sort
            if(Sort) {  //i.e if Sort is true
                break;
            }
        }
        for(int item : a) {

            System.out.print(item + " ");

        }
    }
}