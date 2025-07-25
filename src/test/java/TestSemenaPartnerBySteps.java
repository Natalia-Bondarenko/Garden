import com.codeborne.selenide.Configuration;
import org.apache.log4j.Logger;
import selenideLessons.SelenideLesson002;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.devtools.v134.browser.Browser.close;

public class TestSemenaPartnerBySteps {

    public static void main(String[] args) {

        final Logger log = Logger.getLogger(SelenideLesson002.class);

        log.info("Info message is");

        // Идентификация элементов на веб-странице с использованием Selenide
        Configuration.browser = "chrome";// Используем браузер Chrome

        // Открываем страницу Агрофирма Партнёр
        open("https://semena-partner.ru/");

        // Ждем 30 секунд, чтобы увидеть результаты (можно заменить на ожидание конкретного элемента)
        sleep(1000);

        // Закрываем браузер
        close();


    }
}
