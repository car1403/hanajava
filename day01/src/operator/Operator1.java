package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        long c = a / b;

        int i1 = 10;
        int i2 = 10;
        double i3 = i1*1.0 / i2;
        System.out.println(i3);

        int result = i1++ + ++i2;
        System.out.printf("%d %d %d",result,i1,i2);

        int aa = 0;
        if(3 > 5){
            aa = 6;
        }else{
            aa = 9;
        }

        int bb = (3 > 5) ? 6 : 9;

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // 3수의 최대 값을 구하시오
        int num4 = 0;
        num4 = (num1 > num2) ? ((num1 > num3) ? num1: num3) : ((num2 > num3) ? num2: num3);

        if(num1 > num2){
            if(num1 > num3){
                num4 = num1;
            }else{
                num4 = num3;
            }
        }else{
            if(num2 > num3){
                num4 = num2;
            }else{
                num4 = num3;
            }
        }


    }
}
