import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

public class CustInsertTest {

    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id99").pwd("pwd99").name("james").build();
        try {
            service.add(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello world!");
    }
}