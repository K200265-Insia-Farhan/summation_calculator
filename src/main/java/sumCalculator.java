import java.util.logging.Logger;

public class sumCalculator {
    private static final Logger logger = Logger.getLogger(sumCalculator.class.getName());

    public static String calculateSum(int firstValue, int secondValue,int testcaseid,String expectedValue) {

       logger.info("--------------------------------");
       logger.info("Test Case Id is: "+testcaseid);
       logger.info("First Number Passed: "+firstValue);
       logger.info("Second Number Passed is: "+secondValue);
       logger.info("Expected Result is: " +expectedValue);

        if (firstValue <= 0 || secondValue <= 0) {
            logger.info("Validated Output is: Error");
            return "Error";
        }
        int sum = firstValue + secondValue;
        if (sum > 100) {
            logger.info("Validated Output is: "+sum);
            return String.valueOf(sum);
        } else if (sum == 100) {
            logger.info("Validated Output is: "+(firstValue * secondValue));
            return String.valueOf(firstValue * secondValue);
        } else {
            logger.info("Validated Output is: "+(Math.abs(firstValue - secondValue)));
            return String.valueOf(Math.abs(firstValue - secondValue));
        }
    }
    
}
