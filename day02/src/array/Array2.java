package array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));

        int sum1 = 0;
        for(int i=0; i<a.length;i++){
            sum1 += a[i];
        }
        System.out.println("Sum1:"+sum1);
        for(int data:a){
            System.out.println(data);
        }


    }
}
