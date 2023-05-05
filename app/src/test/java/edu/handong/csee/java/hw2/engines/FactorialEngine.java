package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * A class named FactorialEngine, which inherits from Computable.
 */
public class FactorialEngine implements Computable {

    /**
     * Declares the name of the FACTORIAL, 
     * using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="FACTORIAL";

    /**
     * Declare a variable named result with a double type.
     */
    private int n;

    /**
     * Declare a variable named result with a double type.
     */
    private double result;

    /**
     * This method returns the Enginename.
     */
    public static String getEngineName() {
        return engineName;
    }

    /** 
     * This is a method that returns n.
     */
    public int getN() {
        return n;
    }

    /**
     * This is a method to set n.
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * This is the method to set the result and refer to the result.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This is how to set the inputs in the factorial, 
     * and the reason why inputs.length should not be <2 is that at compile time, 
     * the factorial and one number must be entered.
     * at compile time, so if it is <2, the number will be insufficient.
     */
    public void setInput(String[] inputs) {
        if(inputs.length < 2){
        InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName,1);
        System.exit(0);}
        else if(inputs.length >= 3){
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName);
            System.exit(0);
        }
      
        n = Integer.parseInt(inputs[1]);
        if(n < 0){
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
            System.exit(0);
        }
    }

    /**
     * This is the method to calculate the factorial.
     */
    public void compute() {
        result = 1;
        for(int i = 1; i<=n; i++)
        {result *= i;}
    }
    
    /**
     * This method returns the result of a factorial.
     */
    public double getResult() {
        return result;
    }
}
