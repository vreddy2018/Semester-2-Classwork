/**
* Authors: Ami, Neil, Dhruv
* This class generates a student
* The student has an age, a name, and their grade
* There is one default constructor and 2 overloaded constructors
* In addition to the normal accessors and modifiers, this class
* has a function that calculates who is older when two students are compared
*/

public class Student
{
	/**
	* Nonstatic class field that is the age of the student as an int
	*/
	private int age;
	
	/**
	* Nonstatic class field that is the name of the student as a string
	*/
	private String name;
	
	/**
	* Nonstatic class field that is the grade of the student as an int
	*/
	private int grade;

	/**
	* Static class field that keeps track of how many students are there
	*/
	private static int numStudents;

	/**
	* Default constructor. Takes in no parameters
	* Calls the overloaded method, with the default age and grade as 10
	* and the student's name as "Bob"
	*/
	public Student()
	{
		this(10,10,"Bob");
	}
	
	/**
	* Overloaded constructor 1
	* This constructor takes in the students age and grade
	* and the default name is Jack
	* @param int age - the age of the student
	* @param int grade - the grade of the student
	*/
	public Student(int age, int grade)
	{
		this.age = age;
		this.grade = grade;
		name = "Jack";
		numStudents++;
	}
	
	/**
	* Overloaded constructor 2
	* This constructor takes in the students age, grade and name
	* @param int a - the age of the student
	* @param int g - the grade of the student
	* @param String n - the student's name
	*/
	public Student(int a, int g, String n)
	{
		age = a;
		grade = g;
		name = n;
		numStudents++;	
	}
	
	
	
	/**
	* Age accessor
	* @return - int age - the age of the student
	*/
	public int getAge()
	{
		return age;
	}
	
	/**
	* Grade accessor
	* @return - int grade - the grade of the student
	*/
	public int getGrade()
	{
		return grade;	
	}
	
	/**
	* Name accessor
	* @return -  String name - the name of the student
	*/
	public String getName()
	{
		return name;
	}
	
	/**
	* Number of students accessor
	* @return - int numStudents - the number of students
	*/
	public static int getNumStudents()
	{
		return numStudents;
	}
	
	
	/**
	* Age modifier - changes the age of a student
	* @param - int a - the age of the student
	*/
	public void setAge(int a)
	{
		age = a;
	}
	
	/**
	* Grade modifier - changes the grade of a student
	* @param - int g - the grade of the student
	*/
	public void setGrade(int g)
	{
		grade = g;
	}
	
	/**
	* Name modifier - changes the name of a student
	* @param - int n - the name of the student
	*/
	public void setName(String n)
	{
		name = n;
	}
	
	
	/**
	* Returns the name and information of the student as a string
	* @param String - the name of the student with their age and grade in a readable format
	*/
	public String toString()
	{
		return name + "(" + age + " years old, " + grade + "th grade) ";
	
	}
	
	
	/**
	* This is the static method to find the elder of two students
	* The method works by getting the age of both and comparing the two
	* The method returns the older student
	* @param Student s1 - the first student
	* @param Student s2 - the second student
	* @return Student s1 - the first student is returned if they are older
	* @return Student s2 - the second student is returned if they are older
	*/
	public static Student older(Student s1, Student s2)
	{
		if (s1.age>s2.age)
		{
			return s1;
		}
		else
			return s2;
	
	}
	
	/**
	* This is the nonstatic method to find the elder of two students
	* The method works by getting the age of both and comparing the two
	* The method returns the older student
	* @param Student s1 - the student the initial student is being compared to
	* @return Student s1 - the second student is returned if they are older
	* @return this - the initial student is returned if they are older
	*/
	public Student older(Student s1)
	{
		if (age>s1.age)
		{
			return this;
		}
		else
			return s1;
	}
	
}