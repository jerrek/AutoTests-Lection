import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class YandexTest extends BaseClass {
    @Test(description = "Попытка захода на яндекс")
    public void yandexTest() {
        driver.get("https://www.yandex.ru");//get инструкция, для захода на переданную в метод ссылку
        //тут мы вводим текст в поле запроса, обратите внимание, что поиск элемента на странице
        //происходит по id web элемента
        driver.findElement(By.id("text")).sendKeys("selenium webdriver xpath");
        //а вот тут, мы нашли элемент уже по имени класса
        driver.findElement(By.className("search2__button")).click();
        //а вот тут мы уже наконец добрались до xpath
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/ul/li[3]/div/h2/a/div[2]")).click();
    }
}
