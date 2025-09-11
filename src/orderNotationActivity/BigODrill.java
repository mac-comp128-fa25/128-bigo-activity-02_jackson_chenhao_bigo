package orderNotationActivity;

import java.util.Random;

// Activity Readme can be found here:
// https://docs.google.com/document/d/1UTI-1HLoBwvOo67ZwsHYjArW6qgxBYbsyiaDNri2tA0/edit?usp=sharing

public class BigODrill {

    /**
     * (1)
     * Demonstrates an algorithm with a constant run time, O(1)
     * @param numArr - an int array numArr
     * @return the last element of the array numArr
     */
    public static int constantTime(int[] numArr) {


        return numArr[numArr.length - 1]; // Placeholder to make it compile. Replace me with the correct value.

        // Worksheet: No matter the input size, the runtime is always constant, because O(1).
    }


    /**
     * (2)
     * Demonstrates an algorithm with a linear run time, O(n)
     * @param numArr - an integer array
     * @return the input array where each element of the array is multiplied with itself
     */
    public static int[] linearTime(int[] numArr) {
        

        for (int i = 0; i < numArr.length; i++){
            numArr[i] = numArr[i] ^ 2;
        }

        return numArr;

        // Worksheet: The runtime is the same as the amount of the input, because it is O(n)
    }

    /**
     * (3)
     * Demonstrates an algorithm with O(log n)
     * @param numArr - an integer array
     */
    public static int[] puzzle03(int[] numArr) {
        // Create a new array in which stores the data of indices 1,2,4,8,16,32...etc of the original array
        int index2 = 0;
        int[] tempArr = new int[numArr.length];
        for(int index = 1; index < numArr.length; index = index * 2) {
            tempArr[index2] = numArr[index];
            index2++;
        }
        return tempArr;

        // Worksheet: The runtime is log2 n of the input, because log algorithm is the inverse operation of exponential calculation.
    }

    /**
     * (4)
     * Demonstrates an algorithm with O(n)
     * @param numArr -  a two dimensional rectangular integer array a.k.a 2D matrix
     * @return a double that represents the sparsity of numArr
     */
    public static double sparsity(int[][] numArr) {
        totalCount = 0;
        zeroCount = 0;
        for (int i = 0; i < numArr.length; i++){
            for (int j = 0; j < numArr[i].length; j++){
                totalCount++;
                if (numArr[i][j] == 0){
                    zeroCount++;
                }
            }
        }
        return zeroCount/totalCount; 

        // Worksheet: The runtime will be the same as the number of inputs, since each element is only accessed once in the code.
        // Real-life usage: A rating system maybe? Each row represents a person, and each column represents an attribute to be rated.


    }

    /**
     * (5)
     * Demonstrates an algorithm with TODO: What is the O( ? ) of the following code?
     * @param numArr - two dimensional rectangular integer array a.k.a 2D matrix
     * @param sparsityValue - 0.0-1.0 representing sparsity to make the matrix.
     * @return - numArray overwritten as a sparse matrix with a sparsity of sparsityValue
     */
    public static int[][] sparseMatrix(int[][] numArr, double sparsityValue) {
        assert(sparsityValue >= 0.0 && sparsityValue <= 1.0);
        Random randGenerator = new Random();

        //TODO: Write the code to overwrite the numArr such that it is a sparse matrix
        // with a sparsity of %75

        return numArr;
    }


    public static void main (String[] args){
        //TODO: Write code to run your methods

    }
}
