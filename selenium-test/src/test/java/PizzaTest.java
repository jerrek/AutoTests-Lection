import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class PizzaTest extends BaseClass {
    @Test(description = "Заказ пиццы \"Вкусная\", 40 см на pizzasushiwor.ru")
    public void deliveryTest() throws Exception {
        //заходим на страницу пиццы суши вока
        System.out.println("Заходим на сайт ttps://pizzasushiwok.ru");
        driver.get("https://pizzasushiwok.ru");
        //кликаем на пиццу
        System.out.println("Выбираем раздел пицца");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/header/div[2]/div/nav/ul/li[1]/a/span")).click();
        //кликаем на 40см
        System.out.println("Выбираем 40 см, кто вообще берет пиццу меньше 40см?");
        driver.findElement(By.xpath("//*[@id=\"item404\"]/div[3]/div[2]/div[2]/div[3]/div[3]/div[2]")).click();
        //кликаем на добавить в корзину
        System.out.println("Добавляем выбранное в корзину");
        driver.findElement(By.xpath("//*[@id=\"item404\"]/div[3]/div[2]/div[2]/div[7]/div/a")).click();
        Thread.sleep(10000);
        //кликаем на корзину
        System.out.println("Заходим в корзину");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/ul/li[2]/a")).click();
        //кликаем на далее
        //По причинам настройки сайта (кривыми разработчиками), кликать на кнопку далее в заказе, можно
        // только вызвав JavaScript код, завязанный на клик по этой кнопке
        System.out.println("Кликаем на далее");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("model_cart.goto_order();");
        //Заполняем рег. данные
        System.out.println("Заполняем рег данные");
        driver.findElement(By.xpath("//*[@id=\"order_name\"]")).sendKeys("Marvin");
        driver.findElement(By.xpath("//*[@id=\"order_phone\"]")).sendKeys("89164214214");
        driver.findElement(By.xpath("//*[@id=\"order_metro\"]")).sendKeys("Савеловская");
        driver.findElement(By.xpath("//*[@id=\"order_street\"]")).sendKeys("Огримарская");
        driver.findElement(By.xpath("//*[@id=\"order_home_user\"]")).sendKeys("42");
        driver.findElement(By.xpath("//*[@id=\"order_corp_user\"]")).sendKeys("42");
        driver.findElement(By.xpath("//*[@id=\"order_code_dom_user\"]")).sendKeys("42");
        driver.findElement(By.xpath("//*[@id=\"order_floor_user\"]")).sendKeys("42");
        //кликаем на подвтвердить
        System.out.println("Кликать на подтвердить, мы не будем, дабы не бесить операторов =)");
//        js.executeScript("send_current_order(event); return false;");// не стоит, а то начнут звонить, всех беспокоить
    }
}
