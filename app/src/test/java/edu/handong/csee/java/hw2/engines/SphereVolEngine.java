package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This class is named SpherVolEngine and inherits from class computable.
 */
public class SphereVolEngine implements Computable {

    /**
     * Declares the name of the SPHEREVOL, 
     * using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="SPHEREVOL";

    
    /**
     * Declare radius as a double type.
     */
    private double result;

    /**
     * This is a method to get the engineName.
     */
    private double radius;

    /**
     * This is a method to get the radius.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * This method gets the redius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This method sets the redius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * result to set the result.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * This is how to check the input of SHVEREVOL. 
     * The reason why inputs.length is high than 2 is because at compile time and 1 input is required
     * because we need one input
     */
    public void setInput(String[] inputs){  
        if(inputs.length >= 3){
        InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName);
        System.exit(0);}
        
       
        radius = Double.parseDouble(inputs[1]);
        if(radius < 0){
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
    System.exit(0);
        }
    }
    
    /**
     * This is how to calculate SHVEREVOL.
     */
    public void compute(){
        final double pi = 3.141592653589793;
        result = (4.0 / 3.0) * pi * Math.pow(radius, 3);
    }

    /**
     * This is a method that returns a result.
     */
    public double getResult(){
        return result;
    }
}
