import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CalculationOfMonthsOfRest;

public class CalculationOfMonthsOfRestTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calculation.csv")


    public void restOfTheYear(int expected, int income, int expenses, int threshold) {
        CalculationOfMonthsOfRest service = new CalculationOfMonthsOfRest();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }


}




