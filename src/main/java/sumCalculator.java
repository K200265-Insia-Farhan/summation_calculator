public class sumCalculator {
    public static String calculateSum(int firstValue, int secondValue,int testcaseid,int expectedValue) {

       System.out.println("--------------------------------");
       System.out.println("Test Case Id is: "+testcaseid);
       System.out.println("First Number Passed: "+firstValue);
       System.out.println("Second Number Passed is: "+secondValue);
       System.out.println("Expected Result is: " +expectedValue);
        if (firstValue <= 0 || secondValue <= 0) {
            System.out.println("Validated Output is: Error");
            return "Error";
        }
        int sum = firstValue + secondValue;
        if (sum > 100) {
            System.out.println("Validated Output is: "+sum);
            return String.valueOf(sum);
        } else if (sum == 100) {
            System.out.println("Validated Output is: "+sum);
            return String.valueOf(firstValue * secondValue);
        } else {
            System.out.println("Validated Output is: "+sum);
            return String.valueOf(Math.abs(firstValue - secondValue));
        }
    }
    
}
