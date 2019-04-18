/*
 * Author: @ BUDDHIKA ABEYSEKERA.
 * 
 * In this tutorial what I am going to focus on are the Default Constructor and its behavior.
 * In my previous tutorial on Inheritance, in order to create a setter method I used a public method 
 * to assign values or parameters to private variables in the class.
 * Here I am going to use Default constructor to do the same thing.
 * 
 * Check out me on: LinkedIn: https://www.linkedin.com/in/babey/ 
 * 					GitHub: https://github.com/mbabeysekera/
 */

//Here I have my main Class.
public class DefaultConstructorTest {

	public static void main(String[] args) {
		StdMarks as2013307 = new StdMarks("Buddhika", 80, 90);//Set the marks and name for index as2013307
		StdMarks as2013305 = new StdMarks("Pasindu", 85, 85);//Set the marks and name for index as2013305
		//Get the outputs by using object name as the reference.
		as2013307.getMarks(); 
		as2013305.getMarks();
	}

}

//Now a new Class is define to store students marks for two subjects with their names.
//***When the class is defined, use index number as the object
class StdMarks {
	private String stdName = new String(); //Variable to hold Student index number
	private int sub1, sub2; // Variable to hold student's marks.
	
	//Following method is the default constructor in java. You can pass any parameter as method 
	//arguments in the constructor.
	StdMarks(String name, int s1, int s2) {
		stdName = name; // index will set indexNo variable,
		sub1 = s1; // s1 will set sub1
		sub2 = s2; // s2 will set sub2
	}
	/*
	 * This method will return all the information of that student.
	 */
	public void getMarks() {
		System.out.println("Student Details: " + stdName + ", Subject 1 Score is " + sub1 + 
				" and Subject 2 Score is " + sub2);
	}
}