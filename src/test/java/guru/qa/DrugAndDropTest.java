package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DrugAndDropTest {

    @Test
    public void tryDragAndDrop() {

        // - Откройте https://the-internet.herokuapp.com/drag_and_drop и проверить что прямоугольники находятся на сових местах
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-b").shouldHave(Condition.text("B"));

        // - Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");

        // - Проверьте, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(Condition.text("B"));
    }
}
