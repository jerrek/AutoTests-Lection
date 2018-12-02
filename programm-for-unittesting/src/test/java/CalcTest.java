import org.testng.Assert;
import org.testng.annotations.Test;
import ru.digitalligue.calculator.Calculator;

public class CalcTest {
    @Test(description = "Позитивный сценарий, проверка что метод должен возварщать корректный результат")
    public void testPositivPlus(){
        Assert.assertEquals(Calculator.plus(2,2),4,"Метод plus, в классе Calculator");
    }

    @Test(description = "Негативный сценарий, проверка что метод не вернет не корректный результат")
    public void testNegativPlus(){
        Assert.assertNotEquals(Calculator.plus(2,2),5,"Метод plus, в классе калькулятор не должен 5 вместо 4х");
    }
}
