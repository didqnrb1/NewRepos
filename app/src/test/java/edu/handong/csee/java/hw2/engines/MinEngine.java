package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;


 /**
  * This class is named Maxengine, and it inherits from Computable.
  */
public class MinEngine implements Computable {

    /**
     * Declares the name of the MIN, 
     * using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="MIN";
 
    /**
     * Declare inputs as an array of doubletype.
     */
    private double[] inputs;

    /**
     * Declare the result of min as a double type.
     */
    private double result;
    
    /**
     * This is a method to get the engineName.
     */
    public static String getEngineMame() {
        return engineName;
    }

    /**
     * A method that returns inputs[].
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
     * This method checks for MAX inputs. 
     * The reason why inputs.length is low than 3 is because at compile time, 
     * at least 2 inputs are required along with min. 
     * It is lwo than 3 if there is 1 or less inputs
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
     * This is the method to calculate min.
     */
    public void compute(){
        result = Double.POSITIVE_INFINITY;

        for (double d : inputs) {
            if (d < result) {
                result = d;
            }
        }
    } 

    /**
     * method to get the result.
     */
    public double getResult(){
        return result;
    }
}

