public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        // Setting the variable to integer and multiply by 1000 to see if they up to 3 dp
        int var1 = (int)(num1 * 1000);
        int var2 = (int)(num2 * 1000);
        // Checking if they are equal
        if (var1 == var2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // False cases
        System.out.println(areEqualByThreeDecimalPlaces(3.1465, 3.1456)); //Output: false
        System.out.println(areEqualByThreeDecimalPlaces(3.1465, 3.1457)); //Output: false
        System.out.println(areEqualByThreeDecimalPlaces(3.145, 2.567)); //Output: false
        // True case
        System.out.println(areEqualByThreeDecimalPlaces(3.145, 3.145)); //Output: true
    }
}
