
public class Array2dUtility {

    // Declare all methods as static.

    public static void print(int [][] array2D){
        for(int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D[i].length;j++){
                System.out.println(array2D[i][j]);
            }
        }
    }
    public static int sum(int [][] array2D){
        int sum=0;
        for(int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D[i].length;j++){
                sum += array2D[i][j];
            }
        }
        return sum;
    }
    public static double average(int [][] array2D) {
        double sum = 0;
        int numOfValues = 0;
        for(int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D[i].length;j++){
                sum += array2D[i][j];
                numOfValues++;
            }
        }
        return (sum/numOfValues);
    }
    public static int minimum(int [][] array2D){
        int minimum = 999;
        for(int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D[i].length;j++){
                if(array2D[i][j]<minimum)
                    minimum = array2D[i][j];
            }
        }
        return minimum;
    }
    public static int  maximum(int [][] array2D){
        int maximum = 0;
        for(int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D[i].length;j++){
                if(array2D[i][j]>maximum)
                    maximum = array2D[i][j];
            }
        }
        return maximum;
    }
    public static int evenCountStandard(int [][] array2D){
        int evenCount = 0;
        for(int i=0; i<array2D.length; i++){
            for (int j=0; j<array2D[i].length;j++){
                if(array2D[i][j]%2==0){
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    public static int evenCountEnhanced(int [][] array2D){
        int evenCount = 0;
        for (int[] array1d : array2D){
            for(int num: array1d){
                if(num%2 == 0)
                    evenCount++;
            }
        }
        return evenCount;
    }
    public static boolean allPositive(int [][] array2D){
        boolean allPos = true;
        for (int[] array1d : array2D){
            for(int num: array1d){
                if(num < 0)
                    allPos = false;
            }
        }
        return allPos;
    }
    public static int[] rowSums(int [][] array2D){
        int[] rowSums = new int[array2D.length]; // row is [0,1] [0,2]..
        for(int i =0; i< array2D.length; i++){
            for(int j=0; j<array2D[i].length; j++){
                rowSums[i] += array2D[i][j];
            }
        }
        return rowSums;
    }

    public static int[] colSums(int [][] array2D) { // column is [1,0], [2,0]
        int[] colSums = new int[array2D.length];
        for(int i =0; i< array2D.length; i++){
            for(int j=0; j<array2D[i].length; j++){
                colSums[i] += array2D[j][i];
            }
        }
        return colSums;
    }


    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

}
