package search;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Search {
    @Test
    public void main() {
        //открыть гугл
        open("https://google.com/");
        $("[name=q]").setValue("Selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));
    }
}
