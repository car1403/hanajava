package loop;

public class Loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-----------------------");

        // while 문으로 변경
        int sum2 = 0;
        int j = 1;
        while(j<=10){
            sum2 += j;
            j++;
        }
        System.out.println(sum2);

    }
}



