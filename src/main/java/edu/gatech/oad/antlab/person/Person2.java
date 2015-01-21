package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Raveena Singh
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  	char retval[] = input.toCharArray();
		int max = input.length();
		int min = 0;
		char newString[] = new char[max];
		Random rand = new Random();
		//int j = rand.nextInt(max - min + 1) + min;
	    int j;
		char input1;
		 
		for (int i = 0; i < max; i++) {  
			
			min = 0;
			
			j = rand.nextInt(max);
			
			if (retval[j] == '\0') { 
			
				while (retval[j] == '\0') {
					j = rand.nextInt(max);
					//System.out.println("index " + j);
				}
			}
			
			input1 = retval[j];
			//System.out.println("print" + i + " " + input1);
		    newString[i] = input1;
		    retval[j] = '\0';
		  
		}

		return new String(newString);
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
