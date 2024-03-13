package com.hana.ex1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) {
        InputStreamReader is = null;
        is = new InputStreamReader(System.in);
        try {
            System.out.println(is.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    try {
                        Thread.sleep(2000);
                        is.close();
                    } catch (Exception ex) {
                        try {
                            Thread.sleep(2000);
                            is.close();
                        } catch (Exception exc) {
                            throw new RuntimeException(exc);
                        }

                    }
                }
            }
        }



    }

}
