package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This is a class of gcdEngine, and inherits from computalbe.
 */
public class GCDEngine implements Computable {
    
    /**
     * Declares the name of the GCD, using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="GCD";


    /**
     * Declare the input for the GCD as an int type array.
     */
    private int[] a;

    /**
     * Declare the result as an int type.
     */
    private int result;

    /*
     * This method returns the enginename.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * This is a method to get a[].
     */
    public int[] getA() {
        return a;
    }

    /**
     * Method to set an int[] a.
     */
    public void setA(int[] a) {
        this.a = a;
    }

    /**
     * This is the method to set the result.
     */
    public void setResult(int result) {
        this.result = result;
    }
   
      /**
     * This is a method to get the result of a gcd.
     */
    public double getResult() {
        return result;
    }

    /**
     * This method checks the inputs of the GCD. 
     * The reason why inputs.length is low than 3 is because at compile time, 
     * at least 2 inputs are needed for the GCD. 
     */
    public void setInput(String [] inputs) {
        if (inputs.length < 3) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 2);
            System.exit(0);
        }

        this.a = new int[inputs.length - 1];
        for (int i = 0; i < inputs.length - 1; i++) {
            this.a[i] = Integer.parseInt(inputs[i + 1]);

            if (this.a[i] < 0) {
                InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
                System.exit(0);
            }
        }
    }

     /**
     * This is a method to calculate the GCD.
     */
    public void compute() {
        
        result = a[0];
        for (int i = 1; i < a.length; i++) {
            int x = result;
            int y = a[i];

            while (y != 0) {
                int temp = x % y;
                x = y;
                y = temp;
            }

            result = x;
        }
    }

  
}
