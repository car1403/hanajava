package cal2;

import cal1.Cal;

public class Cal2 {
    static double PI = 3.14;
    public static double sum(int num1, int num2){
        return num1 + num2;
    }
    public static double div(int num1, int num2){
        return num1*1.0 / num2;
    }
    public static double getCircleArea(int r){
        return r * r *  PI;
    }
}
