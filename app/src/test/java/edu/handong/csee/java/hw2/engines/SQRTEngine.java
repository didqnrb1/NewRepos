package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * class named SQRTEngine, which inherits from class computable.
 */
public class SQRTEngine implements Computable {
    
    /**
     * Declares the name of SQRTEngine, 
     * using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="SQRT";

    /**
     * Declare input as a double type.
     */
    private double input;

    /**
     * Declare result as a double type.
     */
    private double result;
    
    /**
     * This is the method to get the input.
     */
    public double getInput() {
        return input;
    }

    /**
     * This method sets the input.
     */
    public void setInput(double input) {
        this.input = input;
    }


    /**
     * This is the method to set the result.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This method checks the inputs of the SQRT. 
     * The reason why inputs.length is low than 2 is because 0 or less inputs are required at compile time and 1 input.
     */
    public void setInput(String [] inputs){
        if(inputs.length < 2){
        InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName,1);
        System.exit(0);}
        else if(inputs.length >= 3){
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName);
            System.exit(0);
        }   


        input = Double.parseDouble(inputs[1]);
        if(input < 0){
        InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        System.exit(0);}
        }

    /**
     * This is a method to calculate the SRQT.
     */
    public void compute(){
        result = Math.sqrt(input);
    }

    /**
     * This is the method to get the result.
     */
    public double getResult(){
        return result;
    }

    /**
     * This is a method to get the Enginename.
     */
    public static String getEngineName() {
        return engineName;
    }
}
