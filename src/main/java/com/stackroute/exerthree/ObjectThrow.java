/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.*/

package com.stackroute.exerthree;

public class ObjectThrow {
    String temp="";
    public String objectfunction(int invalidInput) {
        try
        {
            int input=100/invalidInput;
        }
        catch (ArithmeticException e)
        {
            return temp+="ArithmeticException ..!! Number divided by 0. ";
        }
        finally
        {
            return temp+="This is Finally Block";
        }
    }
}
