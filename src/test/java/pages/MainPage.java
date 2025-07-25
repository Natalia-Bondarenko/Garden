/*

 * Classname site
 *
 * Version information 1.0
 *
 * Date 2025-07-25
 *
 * Copyright notice - ALL RIGHTS RESERVED
 */

package pages;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.devtools.v134.browser.Browser.close;

public class MainPage {

    public static void openBrowser() {
        // Идентификация элементов на веб-странице с использованием Selenide
        Configuration.browser = "chrome";// Используем браузер Chrome

    }

    public static void loadPage() {

        // Открываем страницу Агрофирма Партнёр
        open("https://semena-partner.ru/");
    }

    public static void closeBrowser() {
        // Ждем 30 секунд
        sleep(3000);

        // Закрываем браузер
        close();

    }

}
