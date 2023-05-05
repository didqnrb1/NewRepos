package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This is a class of lcmengine, and inherits from class computable.
 */
public class LCMEngine implements Computable {

    /**
     * Declares the name of the LCM, 
     * using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="LCM";

    /**
     * Declare the variables used by the LCM as an int tpye array.
     */
    private int[] a;

    /**
     * Declare the result as an int type.
     */
    private int result;

    /**
     * This method returns the name of the enginename.
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
     * This is a method to set a[].
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
     * This method sets the input value of the LCM. 
     * The reason why inputs.length is low than 3 is because at compile time, 
     * LCM and at least 2 inputs are required. 
     * If there is less than 1 input, it is low than 3.
     */
    public void setInput(String[] inputs) {
        if (inputs.length < 3) { 
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 2);
            System.exit(0);
        }
        
        a = new int[inputs.length - 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(inputs[i + 1]);
        }
    
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
                System.exit(0);
            }
        }
    }
    
    /**
     * This is the method to calculate the LCM.
     */
    public void compute() {
        int lcm = a[0];
        for (int i = 1; i < a.length; i++) {
            lcm = (lcm * a[i]) / gcd(lcm, a[i]);
        }
        result = lcm;
    }
    
    /**
     * This is a method to calculate gcd. 
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * This is a method to get the result.
     */
    public double getResult() {
        return result;
    }

}
