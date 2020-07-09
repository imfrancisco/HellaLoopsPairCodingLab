package hbcu.stay.ready.mastering_loops;



public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String newString = "";
        for(int i = start; i < stop; i++){
            if(i % 2  == 0){
                String newNumber = Integer.toString(i);
                newString = newString + newNumber;
            }  
        }
       return newString;
    }


    public static String getOddNumbers(int start, int stop){
        String newString = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                String newNumber = Integer.toString(i);
                newString = newString + newNumber;
            }
        }
        return newString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String newString = "";
        for(int i = start; i < stop; i = i + step){
                    int square = i * i;
                    String newNumber = Integer.toString(square);
                    newString += newNumber;
            }
            return newString;
        }


    public static String getRange(int stop) {
        String newString = "";
        for(int i = 0; i < stop; i++){
                newString = newString + Integer.toString(i);
            }  
            return newString;
            
        }  
    

    public static String getRange(int start, int stop) {
        String newString = "";
        for(int i = start; i < stop; i++){
                newString = newString + Integer.toString(i);
            }  
            return newString;
        }
       
       



    public static String getRange(int start, int stop, int step) {
        String newString = "";
        for(int i = start; i < stop; i = i + step ){
                newString = newString + Integer.toString(i);
            }  
            return newString;
        }
    


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String newString = "";
        
        for(int i = start; i < stop; i = i + step){
            int num = 0;
            num = (int) Math.pow(i, exponent);
            newString += num;
        }
        return newString;
    }
}
