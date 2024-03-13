package com.hana.ex1;

public class Ex4 {
    public static void main(String[] args) {

        String str = "1000";
        int num = 0;
        try{
            num = Integer.parseInt(str);
            System.out.println(num);
            int result = 10/0;

        }catch(NumberFormatException | ArithmeticException e){
            System.out.println("입력값이 이상합니다.");
            //e.printStackTrace();
        }catch(Exception e){
            System.out.println("끝");
        }



    }

}
