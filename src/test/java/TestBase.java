import config.WebDriverProvider;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void setUp(){
        WebDriverProvider.configuration();
    }

}
