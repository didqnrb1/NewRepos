package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This class is named maxengine and inherits from class computable.
 */
public class MaxEngine implements Computable {
   
    /**
     * Declares the name of the MAX, using static to allocate it in memory 
     * and final to indicate that it will never change.
     */
    private static final String engineName ="MAX";


    /**
     * Declare inputs as an array of double type.
     */
    private double[] inputs;

    /**
     * Declare result as a double type.
     */
    private double result;
    
    /**
     * This method returns the engineName.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * Method to get inputs[].
     */
    public double[] getInputs() {
        return inputs;
    }

    /**
     * Method to set inputs[].
     */
    public void setInputs(double[] inputs) {
        this.inputs = inputs;
    }

    /**
     * This is a method to set the result.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This method checks the input of MAX. 
     * The reason why inputs.length is ,low than 3 is because at compile time, MAX needs at least 2 inputs. 
     * If there is less than 1 input, it is low than 3.
     */
    public void setInput(String [] input){
        if (input.length < 3) {
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 2);
            System.exit(0);
        }
        
     
        inputs = new double[input.length];

        for(int i = 1; i<input.length; i++)
        {inputs[i] = Double.parseDouble(input[i]);
          }
        
    }
    
    /**
     *  This is the method to calculate max.
     */
    public void compute(){
        result = Double.NEGATIVE_INFINITY;

        for (double d : inputs) {
            if (d > result) {
                result = d;
            }
        }
    } 

    /**
     * This is a method to get the result of max.
     */
    public double getResult(){
        return result;
    }
}