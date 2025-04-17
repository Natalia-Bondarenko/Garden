import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.devtools.v134.browser.Browser.close;

public class Web {

    public static void main(String[] args) {

        // Устанавливаем настройки Selenide (можно опустить, если необходимо)
        Configuration.browser = "chrome";// Используем браузер Chrome

        // Открываем страницу Агрофирма Партнёр
        open("https://semena-partner.ru/");

        // Находим поле ввода поискового запроса и вводим запрос
        $("[name='q']").setValue("перец кеша").pressEnter();

        // Ждем 30 секунд, чтобы увидеть результаты (можно заменить на ожидание конкретного элемента)
        sleep(30000);

        // Закрываем браузер
        close();

    }

}
