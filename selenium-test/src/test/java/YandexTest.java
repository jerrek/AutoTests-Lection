import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YandexTest extends BaseClass {
    @Test(description = "Попытка захода на яндекс")
    public void yandexTest() {
        System.out.println("Заходим на сайт Yandex");
        driver.get("https://www.yandex.ru");//get инструкция, для захода на переданную в метод ссылку
        //тут мы вводим текст в поле запроса, обратите внимание, что поиск элемента на странице
        //происходит по id web элемента
        System.out.println("Вбиваем в строку поиска инфу");
        driver.findElement(By.id("text")).sendKeys("selenium webdriver xpath");//sendKeys инструкция, для ввода текста
        //а вот тут, мы нашли элемент уже по имени класса
        System.out.println("Кликаем по кнопке найти");
        driver.findElement(By.className("search2__button")).click();//это клик... инструкция клик кликает, вот так: клик клик =)
        //а вот тут мы уже наконец добрались до xpath
        System.out.println("Кликаем по нужной ссылке");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/ul/li[3]/div/h2/a/div[2]")).click();
    }
}
