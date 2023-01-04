package com.example.assignment1bscaffold;

public class ExercisesEasy {

    /**
     * Returns true if word is a palidrome or false.
     * 
     * @param word
     * @return
     */

    static Boolean isPalindrome(String word) {

        // add response here.
    }

    /**
     * Provides the transpose of a matrix. A transposed matrix is one where that replaces the 
     * columns with the rows. So, the transpose of matrix A
     * {{1, 2, 3}, {4, 5, 6}} is matrix A^T {{1, 4}, {2, 5}, {3, 6}}.
     * 
     * @param matrix
     * @return the transposed matrix
     * @throws MatrixException
     */

    static int[][] transposeMatrix(int[][] matrix) throws MatrixException {
        
    }

    /**
     * Provides the minimum value for an array.
     * @param array
     * @return an integer that is the smallest value in the array.
     */

    static int getMinValue(int[] array) {

    }

    /**
     * Provides the maximum value of an array.
     * 
     * @param array
     * @return an integer that is the greatest value in the array.
     */

    static int getMaxValue(int[] array) {
        
    }

    /**
     * Provide the normalized values for a list of integers from bottomOfRange to topOfRange.
     * 
     * Normalized values are values that are scaled across a range of values. For example, the array {1, 3, 9, 10}
     * normalized between 0 and 10 would be {0, ~2.2223, ~8.88889, 10}. The formula for normalization is as follows:
     * 
     * let a = bottom of desired range. 
     * Let b = top of desired range. 
     * Let x = list vector.
     * Let x' = given value in a list. 
     * Let n = the normalized value. 
     * 
     * n = (b - a) (x' - min(x)) / (max(x) - min(x)) + a 
     * 
     * A word of caution: when integers are divided, they are rounded. You will need to explore the Java
     * documentation to uncover how to 
     * 
     * @param values - a list of integers to be normalized
     * @param bottomOfRange - the lowest normalized value desired.
     * @param topOfRange - the highest normalized value desired.
     * @return - a new list with the normalized values.
     */

    static double[] normalizeBetween(int[] values, int bottomOfRange, int topOfRange) {
        
    }
    
}
