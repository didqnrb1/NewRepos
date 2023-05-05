package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * Class of cubevolengine, inherits from computable.
 */
public class CubeVolEngine implements Computable {

    /**
     * Declares the name of the CUBEVOL, 
     * using static to allocate it in memory and final to indicate that it will never change.
     */
    private static final String engineName ="CUBEVOL";

    /**
     * A variable of type double representing one sidelength of the cube.
     */
    private double sideLength;

    /**
     * A variable named volume with a double type.
     */
    private double volume;
    
    /**
     * A method that returns an enginename.
     */
    public static String getEngineName() {
        return engineName;
    }
 
    /**
     * This method gives the sidelength.
     */
    public double getSideLength() {
        return sideLength;}

    /**
     * This method sets the sideLength.
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * This method returns a volume variable.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * This method sets the volume variable.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * This method sets the inputs of the CubeVolEngine and requires two variables. 
     * inputs.length<2 because inputs[0] already contains 1 when using the CubeVol method at compile time.
     * inputs.length defaults to 1, so we need 2 more variables.
     */
    public void setInput(String[] inputs){
        if(inputs.length <2){
        InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName,1);
        System.exit(0);
    }
    else if(inputs.length >=3){
        InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName);
        System.exit(0);
    }

    sideLength = Double.parseDouble(inputs[1]);

    if(Double.parseDouble(inputs[1])<0){
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
            System.exit(0);
     }
}

    /**
     * This is how to calculate the CubeVol. Since volume is the cube of sideLength. This is expressed as expression.
     */
    public void compute(){
        volume = sideLength*sideLength*sideLength;
    }
    
    /**
     * This method returns a volume of type double.
     */
    public double getResult(){
        return volume;
    }

 
}