package edu.handong.csee.java.hw2.util;

/**
 *  A class named inputchecker that checks the input of the class.
 */
public class InputChecker {

    /**
     * This method is used when the number of variables is small.
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need at least " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
 }

   /**
    * This method is used when the number of variables is large.
    */
   public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName){
        System.out.println("You need 1 input values for " + engineName.toUpperCase() +".");
        System.exit(0);
    }

    /**
     * This method prints an error message when a negative number is not allowed in the input.
     */
    public static void printErrorMessageForNegativeInputsAndExit(String engineName){
        System.out.println("The input value cannot be negative for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }
    
     /**
     * This method prints an error message if the engine to calculate is not selected.
     */
    public static void printInputEngineOptionAndExit() {
        System.out.println("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL.\nFor example, java -cp [your classpath] edu.handong.csee.java.hw2.Calculator MAX 12 4 5 45 100");
        System.exit(0);
    }

   }
   
