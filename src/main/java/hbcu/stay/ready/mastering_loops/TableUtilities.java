package hbcu.stay.ready.mastering_loops;
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String newString = "";
        int product;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                product = i * j;
                newString =  String.format( "%s%3s |", newString, Integer.toString(product) );
            }
            newString += "\n";
        }
        return newString;
    }
    public static String getLargeMultiplicationTable() {
        String newString = "";
        int product;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                product = i * j;
                newString =  String.format( "%s%3s |", newString, Integer.toString(product) );
            }
            newString += "\n";
        }
        return newString;
    }
    public static String getMultiplicationTable(int tableSize) {
        String newString = "";
        int product;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                product = i * j;
                newString =  String.format( "%s%3s |", newString, Integer.toString(product) );
            }
            newString += "\n";
        }
        return newString;
    }
}