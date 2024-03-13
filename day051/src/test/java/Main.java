import com.hana.data.CustDto;

public class Main {
    public static void main(String[] args) {
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        System.out.println(custDto);

    }
}