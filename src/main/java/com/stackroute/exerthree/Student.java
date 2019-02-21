/*Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.*/

package com.stackroute.exerthree;
import java.lang.*;
public class Student {
        public String grades(int n, int[] grades){
            String temp="";
            for(int i=0;i<n;i++)
            {
                if(grades[i]>0 && grades[i]<=100)
                {
                    temp="Grades are within the range";
                }
                else
                {
                    try{
                        throw new ArguementOutOfBoundException();
                    }
                    catch (ArguementOutOfBoundException e){
                        temp= e.getMessage();
                    }
                    return temp;
                }
            }
            return temp;
        }
    }
    class ArguementOutOfBoundException extends Exception{
        public String getMessage(){
            return "Grades are out of range";
        }
    }


