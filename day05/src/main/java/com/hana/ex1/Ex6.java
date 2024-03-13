package com.hana.ex1;

import java.io.InputStreamReader;

public class Ex6 {
    public static void main(String[] args) {
        // try with resource

        try(InputStreamReader is = new InputStreamReader(System.in)){
            System.out.println(is.read());
        }catch(Exception e){

        }
    }

}
