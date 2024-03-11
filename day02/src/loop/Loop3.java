package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out:while(true){
            System.out.println("Input Command ..(q,c,r,u,d)");
            String cmd = sc.next();
            if(cmd.equals("q")){
                System.out.println("Bye");
                sc.close();
                break;
            }
            switch (cmd){
                case "c": System.out.println("Create"); break;
                case "r": System.out.println("Input ID...");
                    String id = sc.next();
                    System.out.println("Read ID Info ...");
                    break;
//                    sc.close();
//                    break out;
                case "u": System.out.println("Update"); break;
                case "d": System.out.println("Delete"); break;
                default: System.out.println("Try Again");
            }
        }
        System.out.println("End ....");
    }
}
