/**
* Authors: Ami, Neil, Dhruv
* This class generates a classroom and calls upon the Student class
* The class has a period and a list of students
*/

public class Classroom
{
	/**
	* Nonstatic class field that is the array of the students in the class
	*/
	private Student[] section;
	
	/**
	* Nonstatic class field that is the period of the class as an int
	*/
	private int period;
	
	/**
	* Default constructor. Takes in no parameters
	* Creates a default classroom with 13 students and makes
	* each student the default student
	*/
	public Classroom()
	{
		section = new Student[13]; 
		
		for (int i = 0; i < section.length; i ++)
		{
			section[i] = new Student();
		}	
		
		
		period = 0; 
	}

	/**
	* Overloaded constructor. Takes in a list of students and the period int
	* @param Student[] a - the section/list of students in the class
	* @param int p - the period of the class
	*/
	public Classroom(Student[] a, int p)
	{
		section = a;
		period = p;
	}
	
	
	
	/**
	* List of students accessor
	* @return - Student[] section - the list of the students
	*/
	public Student[] getSection()
	{
		return section;
	}
	
	/**
	* Specific student - accessor
	* @param int i - the students position in the class
	* @return - Student section[i] - the specific student
	*/
	public Student getStudent(int i)
	{
		return section[i];
	}	
	
	/**
	* Period accessor
	* @return - int period - the period of the class
	*/
	public int getPeriod()
	{
		return period;
	}
	
	
	/**
	* Student modifier - sets one of the students in the class
	* @param - int i - the position of the student in the section
	* @param Student s - the student to insert in position i
	*/
	public void setStudent(int i, Student s)
	{
		section[i] = s;
	}

	/**
	* Period modifier - changes the period of the class
	* @param - int i - the period of the class
	*/
	public void setPeriod(int i)
	{
		period = i;
	}

	/**
	* Returns the period and list of students in the class as a string in readable/printable format
	* @param String - the period and the list of students in printable format
	*/
	public String toString()
	{
		String s = "";
		s += "period: " + period + "\n";
		
		for (int i = 0; i < section.length; i ++)
		{
			s+= section[i].toString() + "\n";
		}
		return s;
		
	
	}	
	
	/**
	* This is the nonstatic method to find the oldest student in a classrom
	* The method works by setting the oldest student as the first one
	* and then comparing it to the next student using the older method in the student class
	* if the next student is older, they are set to the new oldest. 
	* @return oldest - the oldest student
	*/
	public Student findOldest()
	{
		Student oldest = section[0];
		
		for (int i = 1; i < section.length; i ++)
		{
			oldest = oldest.older(section[i]);

		}
		return oldest;
	}	

}