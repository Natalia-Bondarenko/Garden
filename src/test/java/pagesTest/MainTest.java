package pagesTest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MainTest {

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {

        MainPage site = new MainPage();

        //Открыть браузер
        site.openBrowser();

        //Загрузить страницу
        site.loadPage();

    }

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void mainTest() {
        // Находим поле ввода поискового запроса и вводим запрос
        $("[name='q']").setValue("перец кеша").pressEnter();

        // Ждем 30 секунд
        sleep(3000);

        // Находим поле с заголовком найденного товара
        String text = $("div[class='item-name']").getText();

        //Сравниваемс введённым запросом
        Assert.assertEquals(text, "Партнер Перец КЕША F1 ^(5шт) 2-ной пак");

    }

    /**
     * осуществление закрытия окна браузера
     */
    @AfterClass
    public static void tearDown() {

        MainPage site = new MainPage();

        //Закрыть страницу
        site.closeBrowser();

    }
}
