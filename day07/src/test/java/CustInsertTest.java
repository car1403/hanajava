import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

public class CustInsertTest {

    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id97").pwd("pwd97").name("james").build();
        try {
            service.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello world!");
    }
}