import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void BeforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {


        open("/text-box");

        $("[id=userName]").setValue("Ilja Danilov");
        $("[id=userEmail]").setValue("iljadaniloff@gmail.com");
        $("[id=currentAddress]").setValue("Russia");
        $("[id=permanentAddress]").setValue("Russia");
        $("#submit").click();

        $("#output").shouldHave(text("Ilja Danilov"), text("iljadaniloff@gmail.com"),
                text("Russia"), text("Russia"));
    }
}
