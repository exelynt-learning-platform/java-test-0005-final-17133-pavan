import java.util.*;

class NumberPattern {

    public static void main(String [] args) {
        int count = 1;

        for (int rows = 1; rows <= 6; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(count);
                if (col < rows) {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
        }

    }

}
