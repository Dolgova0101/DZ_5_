import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalculationOfMonthsOfRest;

public class CalculationOfMonthsOfRestTest {
    @Test


    public void threeMonthsAYear() {
        CalculationOfMonthsOfRest service = new CalculationOfMonthsOfRest();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected,actual);


    }

         @Test
          public void twoMonthsAYear() {
             CalculationOfMonthsOfRest service = new CalculationOfMonthsOfRest();
             int expected = 2;
             int actual = service.calculate(100_000, 60_000, 150_000);

             Assertions.assertEquals(expected, actual);
         }


}




