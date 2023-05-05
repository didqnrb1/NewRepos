package edu.handong.csee.java.hw2.engines;

/**
 * Represents the interface of the methods executed by mathCalculator.
 * An interface is a collection of declared methods.
 */ 
public interface Computable {

    /**
     * A method that checks the input to the mathcalculator and receives a value.
     */
    void setInput(String[] inputs);

    /**
     * This method calculates the above setInput according to each function.
     */
    void compute();
    
    /**
     * Returns the result calculated by compute.
     * This method returns the result calculated by compute above.
     */
    double getResult();
}
