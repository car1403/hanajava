import org.example.app.data.CustDto;

public class Main {
    public static void main(String[] args) {
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").build();
        System.out.println(custDto);
    }
}