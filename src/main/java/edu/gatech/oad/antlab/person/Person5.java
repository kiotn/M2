//package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
import java.util.Scanner;
public class Person5 {
  /** Holds the persons real name */

    public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		Person5 name = new Person5("gtg123b");
		System.out.println("gtg123b");
		System.out.println(name.calc("gtg123b"));
    }
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
		char[] oldName = input.toCharArray();
		char[] newName = new char[input.length()];
		newName[oldName.length-1] = oldName[1];
		newName[oldName.length-2] = oldName[0];

		for(int i=0; i<input.length()-2; i++){
			newName[i] = oldName[i+2];
		}
		String str = String.valueOf(newName);
		return str;
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
