package variable;

public class Variable4 {
    public static void main(String[] args) {
        String str = "jmlee@tonesol.com";

        // id와 domain을 출력 하시오
        String id = str.substring(0,str.indexOf('@')).toUpperCase();
        String domain = str.substring(str.indexOf('@')+1, str.indexOf('.')).toUpperCase();

        System.out.printf("%s,%s",id, domain);
    }
}
