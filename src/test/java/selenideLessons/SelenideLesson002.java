package selenideLessons;

import org.apache.log4j.Logger;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.devtools.v134.browser.Browser.close;

public class SelenideLesson002 {
    public static void main(String[] args) {

        final Logger log = Logger.getLogger(SelenideLesson002.class);

        log.info("Info message is");

        // Идентификация элементов на веб-странице с использованием Selenide
        Configuration.browser = "chrome";// Используем браузер Chrome

        Exercise1();

        //Exercise2();

        //Exercise3();

        //Exercise4();

        // Ждем 30 секунд, чтобы увидеть результаты (можно заменить на ожидание конкретного элемента)
        sleep(3000);

        // Закрываем браузер
        close();

    }

    public static void Exercise4() {
        //Задача: Разработайте тест, который имитирует нажатие на кнопку и проверяет,
        // что после этого происходит какое-то изменение на странице
        // (например, появление нового элемента или изменение текста).

        // Открываем страницу турагенство Травелата
        open("https://travelata.ru/");

        $("#startSearch").click();

        //String elementText = $x("//div[@class=\"calendar-lp-serp__header-title\"]").getText();
        //String elementText = $("div[class='calendar-lp-serp__header-title']").getText();
        String elementText = $(".calendar-lp-serp__header-title").getText();

        if (elementText.equals("Календарь низких цен")) {
            System.out.println("Заголовок появился: " + elementText);
        } else {
            System.out.println("Заголовок НЕ появился: " + elementText);
        }
    }

    public static void Exercise3() {

        //Задача: Напишите тест, который проверяет наличие изображения на странице
        // (можете использовать любое изображение из интернета) и убедитесь,
        // что у изображения задан атрибут alt.

        // Открываем страницу РЖД
        open("https://www.rzd.ru/");

        //if ($$(By.xpath("//img[@data-test-id=\"logo\"]")).filter(visible).size() > 0) {
        if ($$("img[data-test-id='logo']").filter(visible).size() > 0) {
            System.out.println("Лого ЕСТЬ!");
        } else {
            System.out.println("Лого НЕТ...");
        }

        String attribute = "alt";
        //String attributeValue = $(By.xpath("//img[@data-test-id=\"logo\"]")).getAttribute(attribute);
        String attributeValue = $("img[data-test-id='logo']").getAttribute(attribute);

        if (attributeValue.equals("null")) {
            System.out.println("Атрибут " + attribute + " отсутвсвует...");
            System.out.println("Результат получения атрибута:" + attributeValue);
        } else {
            System.out.println("Атрибут " + attribute + " найден!");
            System.out.println("Результат получения атрибута:" + attributeValue);
        }

    }


    public static void Exercise2() {

        //Задача: Напишите тест, который заполняет форму с использованием Selenide.
        // Задайте произвольные значения для полей формы (например, имя, электронная почта, сообщение)
        // и убедитесь, что форма успешно отправляется (проверьте, что после отправки появляется
        // подтверждающее сообщение или элемент).

        // Открываем страницу БЧ
        open("https://www.rw.by/");

        // Найти поля и вставить нужную инфорацию
        //Отказать в куки
        $("button[class='btn btn-default mc-btn-all']").click();

        sleep(3000);

        String from = "Москва";
        //Заполнение поля "Откуда"
        $("#acFrom").setValue(from);

        sleep(3000);

        String to = "Минск";

        //Заполнение поля "Куда"
        $("#acTo").setValue(to);

        sleep(3000);

        //Заполнение поля "Дата"
        $("#yDate").setValue("25.04.2025");

        sleep(3000);

        //Нажатие на кнопку "Найти"
        $(".std-button").click();

        sleep(3000);

        //Нажатие на кнопку "Отклонить" cookie
        $("button[class='btn btn-index mc-decline-all']").click();

        //Нажатие на значок "Закрыть" онлайн-консультант
        //$(By.xpath("//div[@class=\"webim-actions\"]")).click();

        sleep(3000);

        // Чтение появляющегося сообщения
        String elementText = $(".sch-title").getText();

        System.out.println("Текст элемента: " + elementText);

        if (!elementText.equals("")) {
            System.out.println("Элемент появился: " + elementText);
        } else {
            System.out.println("Элемент НЕ появился: " + elementText);
        }

    }

    public static void Exercise1() {

        //Задача: Создайте тест, который открывает браузер,
        // переходит на любую страницу и проверяет,
        // что заголовок страницы не пустой.

        // Открываем страницу Агрофирма Партнёр
        open("https://semena-partner.ru/");

        //Получение текста заголовка
        String elementText = $(".Main-product_title").getText();


        if (elementText != null) {
            System.out.println("Exercise 1: Заголовок Main-product_title содержит значение " + elementText + " .");
        } else {
            System.out.println("Exercise 1: Заголовок Main-product_title ПУСТОЙ!");
        }

    }
}
