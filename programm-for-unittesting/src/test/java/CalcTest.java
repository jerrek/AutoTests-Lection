import org.testng.Assert;
import org.testng.annotations.Test;
import ru.digitalligue.calculator.Calculator;

public class CalcTest {
    @Test(description = "Позитивный сценарий, проверка что метод должен возварщать корректный результат")
    /*AssertEquals сравнивает между сосбой 2 числа, и выдает строчку написаную справа, если цифры не равны
    *Первый параметр, сдесь Calculator.plus(2,2), когда тест выполняется, вместо этой строчки, будет результат
    * вычисления 2+2, то есть 4, второй параметр, это то что мы ожидаем увидеть, то есть чему должен равнятся
    * первый параметр, ну а справа сообщение которое появится в случае если параметры не равны
    */
    public void testPositivPlus(){
        Assert.assertEquals(Calculator.plus(2,2),4,"Метод plus, в классе Calculator");
    }

    @Test(description = "Негативный сценарий, проверка что метод не вернет не корректный результат")
    public void testNegativPlus(){
        Assert.assertNotEquals(Calculator.plus(2,2),5,"Метод plus, в классе калькулятор не должен 5 вместо 4х");
    }
}
