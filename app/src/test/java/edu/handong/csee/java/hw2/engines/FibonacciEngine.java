package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This is a class of fibonacciEngine, and inherits from class computable.
 */
public class FibonacciEngine implements Computable {

    /**
     * Declares the name of fibonacciEngine, 
     * using static to allocate it in memory and final to indicate that it will never change
     */
    private static final String engineName ="FIBONACCI";


    /**
     * Declare the variable n used by fibonacci as an int type.
     */
    private int n ;

    /**
     * Declare result as a doubletype.
     */
    private double result;
    
    /**
     * This method returns the enginName.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * This is a method to get n.
     */
    public int getN() {
        return n;
    }

    /**
     *  This method sets n.
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * This method sets the result.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This is how to set the input of fibonacci, 
     * and inputs.length is low than 2 because you need to enter fibonacci and numbers at compile time. 
     * If there is 1 or 0, the program will not run.
     */
    public void setInput(String[] inputs){
        if(inputs.length < 2){
        InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName,1);
        System.exit(0);}
        else if(inputs.length >=3){
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
     * A method to calculate fibonacci.
     */
    public void compute(){
        if(n == 0){
            result = 0;
        } else if(n == 1){
            result = 1;
        } else {
            double prev = 0;
            double curr = 1;
            for(int i = 2; i <= n; i++){
                double next = prev + curr;
                prev = curr;
                curr = next;
            }
            result = curr;
        }
    }

    /**
     * This method returns the result of fibonacci.
     */
    public double getResult(){
        return result;
    }
}
