package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ComparePrice {

    @Test
    public void shouldOpenCorrectPage() {
        //На главной странице GitHub выберите меню Pricing -> Compare Plans с помощью команды hover для Pricing.
        open("https://github.com/");
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byText("Compare plans")).click();

        // Убедитесь что загрузилась нужная страница
        $("#compare-features").shouldBe(Condition.visible);
    }
}
