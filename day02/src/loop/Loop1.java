package loop;

public class Loop1 {
    public static void main(String[] args) {
        for(int i=0;  ; i++){
            if(i >= 100){
                break;
            }
            if(i%2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}