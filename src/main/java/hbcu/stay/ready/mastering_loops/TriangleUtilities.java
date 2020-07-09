package hbcu.stay.ready.mastering_loops;

import java.util.*;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder aStringBuilder = new StringBuilder();
        String triangle = "";
        for(int index = 1; index < numberOfRows; index++)
        {
            aStringBuilder.append("*");
            String newTriangle = aStringBuilder.toString();
            triangle = triangle + newTriangle + "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String aRow = "";
        for(int i = 0; i < numberOfStars; i++){
            String formRow = "*";
            aRow = aRow + formRow;
        }
        return aRow; 
    }

    public static String getSmallTriangle() {
        StringBuilder aSmallTriangle = new StringBuilder();
        String smallTriangle = "";
        for(int index = 1; index < 5; index++)
        {
            String sTriangle;
            aSmallTriangle.append("*");
            sTriangle = aSmallTriangle.toString();
            smallTriangle = smallTriangle + sTriangle + "\n";
        }
        return smallTriangle;
    }

    public static String getLargeTriangle() {
    StringBuilder aStringBuilder = new StringBuilder();
    String largeTriangle = "";
    for(int index = 1; index <= 9; index++){
        aStringBuilder.append("*");
        String lTriangle = aStringBuilder.toString();
        largeTriangle = largeTriangle + lTriangle + "\n";
    }
        return largeTriangle;
    }
}
